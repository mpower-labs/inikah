package com.inikah.hook.login;

import com.inikah.slayer.service.ProfileLocalServiceUtil;
import com.inikah.util.MaxMindUtil;
import com.liferay.portal.kernel.events.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

public class PostLoginAction extends Action {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#Action()
	 */
	public PostLoginAction() {
		super();
	}

	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#run(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		// TODO Auto-generated method stub

		User user = null;
		try {
			user = PortalUtil.getUser(request);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		if (Validator.isNull(user)) return;
		
		// Set Max Mind Coordinates
		MaxMindUtil.setCoordinates(user);
		
		// attach new profile with the user. 
		ProfileLocalServiceUtil.attachProfileToUser(user);		
		
		// Set the ownerLastLogin for all the profiles owned by this user
		ProfileLocalServiceUtil.setOwnerLastLogin(user.getUserId());
	}
}