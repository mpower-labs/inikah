/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inikah.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProfileLocalService}.
 *
 * @author Ahmed Hasan
 * @see ProfileLocalService
 * @generated
 */
public class ProfileLocalServiceWrapper implements ProfileLocalService,
	ServiceWrapper<ProfileLocalService> {
	public ProfileLocalServiceWrapper(ProfileLocalService profileLocalService) {
		_profileLocalService = profileLocalService;
	}

	/**
	* Adds the profile to the database. Also notifies the appropriate model listeners.
	*
	* @param profile the profile
	* @return the profile that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.Profile addProfile(
		com.inikah.slayer.model.Profile profile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.addProfile(profile);
	}

	/**
	* Creates a new profile with the primary key. Does not add the profile to the database.
	*
	* @param profileId the primary key for the new profile
	* @return the new profile
	*/
	@Override
	public com.inikah.slayer.model.Profile createProfile(long profileId) {
		return _profileLocalService.createProfile(profileId);
	}

	/**
	* Deletes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profileId the primary key of the profile
	* @return the profile that was removed
	* @throws PortalException if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.Profile deleteProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.deleteProfile(profileId);
	}

	/**
	* Deletes the profile from the database. Also notifies the appropriate model listeners.
	*
	* @param profile the profile
	* @return the profile that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.Profile deleteProfile(
		com.inikah.slayer.model.Profile profile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.deleteProfile(profile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _profileLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.inikah.slayer.model.Profile fetchProfile(long profileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.fetchProfile(profileId);
	}

	/**
	* Returns the profile with the primary key.
	*
	* @param profileId the primary key of the profile
	* @return the profile
	* @throws PortalException if a profile with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.Profile getProfile(long profileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.getProfile(profileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.ProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profiles
	* @param end the upper bound of the range of profiles (not inclusive)
	* @return the range of profiles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.inikah.slayer.model.Profile> getProfiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.getProfiles(start, end);
	}

	/**
	* Returns the number of profiles.
	*
	* @return the number of profiles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProfilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.getProfilesCount();
	}

	/**
	* Updates the profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param profile the profile
	* @return the profile that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.inikah.slayer.model.Profile updateProfile(
		com.inikah.slayer.model.Profile profile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profileLocalService.updateProfile(profile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _profileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_profileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _profileLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.inikah.slayer.model.Profile quickAdd(boolean bride,
		java.lang.String emailAddress, java.lang.String month,
		java.lang.String year, int maritalStatus, int createdFor,
		int motherTongue, java.lang.String profileName,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _profileLocalService.quickAdd(bride, emailAddress, month, year,
			maritalStatus, createdFor, motherTongue, profileName, serviceContext);
	}

	@Override
	public com.inikah.slayer.model.Profile updateProfile(long profileId,
		java.lang.String phone1, java.lang.String phone2, long residingCountry,
		long residingState, long residingCity,
		java.lang.String reMarriageReason, boolean hasChildren, int sons,
		int daughters, int height, int weight, int complexion,
		int motherTongue, int education, java.lang.String educationDetail,
		int religiousEducation, java.lang.String religiousEducationDetail,
		int profession, java.lang.String professionDetail,
		java.lang.String organization, int currency, int monthlyIncome,
		long countryOfOrigin, long stateOfOrigin, long cityOfOrigin,
		int community, int ethnicity, java.lang.String description,
		java.lang.String expectation, java.lang.String hobbies,
		boolean physicallyChallenged,
		java.lang.String physicallyChallengedDetails, boolean performedHaj,
		boolean revertedToIslam, int muslimSince, java.lang.String status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _profileLocalService.updateProfile(profileId, phone1, phone2,
			residingCountry, residingState, residingCity, reMarriageReason,
			hasChildren, sons, daughters, height, weight, complexion,
			motherTongue, education, educationDetail, religiousEducation,
			religiousEducationDetail, profession, professionDetail,
			organization, currency, monthlyIncome, countryOfOrigin,
			stateOfOrigin, cityOfOrigin, community, ethnicity, description,
			expectation, hobbies, physicallyChallenged,
			physicallyChallengedDetails, performedHaj, revertedToIslam,
			muslimSince, status, serviceContext);
	}

	@Override
	public void updateStatus(long profileId, java.lang.String status) {
		_profileLocalService.updateStatus(profileId, status);
	}

	@Override
	public void setOwnerLastLogin(long userId) {
		_profileLocalService.setOwnerLastLogin(userId);
	}

	/**
	* @param user
	* @param serviceContext
	*/
	@Override
	public void attachProfileToUser(com.liferay.portal.model.User user) {
		_profileLocalService.attachProfileToUser(user);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProfileLocalService getWrappedProfileLocalService() {
		return _profileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProfileLocalService(
		ProfileLocalService profileLocalService) {
		_profileLocalService = profileLocalService;
	}

	@Override
	public ProfileLocalService getWrappedService() {
		return _profileLocalService;
	}

	@Override
	public void setWrappedService(ProfileLocalService profileLocalService) {
		_profileLocalService = profileLocalService;
	}

	private ProfileLocalService _profileLocalService;
}