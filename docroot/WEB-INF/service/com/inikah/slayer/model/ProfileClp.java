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

package com.inikah.slayer.model;

import com.inikah.slayer.service.ClpSerializer;
import com.inikah.slayer.service.ProfileLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class ProfileClp extends BaseModelImpl<Profile> implements Profile {
	public ProfileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Profile.class;
	}

	@Override
	public String getModelClassName() {
		return Profile.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _profileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProfileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _profileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("profileId", getProfileId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("ownerLastLogin", getOwnerLastLogin());
		attributes.put("createdFor", getCreatedFor());
		attributes.put("profileName", getProfileName());
		attributes.put("profileCode", getProfileCode());
		attributes.put("bride", getBride());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("bornOn", getBornOn());
		attributes.put("reMarriageReasons", getReMarriageReasons());
		attributes.put("hasChildren", getHasChildren());
		attributes.put("sons", getSons());
		attributes.put("daughters", getDaughters());
		attributes.put("height", getHeight());
		attributes.put("weight", getWeight());
		attributes.put("complexion", getComplexion());
		attributes.put("motherTongue", getMotherTongue());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("phone1", getPhone1());
		attributes.put("phone2", getPhone2());
		attributes.put("residingCountry", getResidingCountry());
		attributes.put("residingState", getResidingState());
		attributes.put("residingCity", getResidingCity());
		attributes.put("residingArea", getResidingArea());
		attributes.put("nearbyMasjid", getNearbyMasjid());
		attributes.put("education", getEducation());
		attributes.put("educationDetail", getEducationDetail());
		attributes.put("religiousEducation", getReligiousEducation());
		attributes.put("religiousEducationDetail", getReligiousEducationDetail());
		attributes.put("profession", getProfession());
		attributes.put("professionDetail", getProfessionDetail());
		attributes.put("organization", getOrganization());
		attributes.put("currency", getCurrency());
		attributes.put("monthlyIncome", getMonthlyIncome());
		attributes.put("countryOfBirth", getCountryOfBirth());
		attributes.put("stateOfBirth", getStateOfBirth());
		attributes.put("cityOfBirth", getCityOfBirth());
		attributes.put("community", getCommunity());
		attributes.put("ethnicity", getEthnicity());
		attributes.put("canSpeak", getCanSpeak());
		attributes.put("description", getDescription());
		attributes.put("expectation", getExpectation());
		attributes.put("hobbies", getHobbies());
		attributes.put("physicallyChallenged", getPhysicallyChallenged());
		attributes.put("physicallyChallengedDetails",
			getPhysicallyChallengedDetails());
		attributes.put("performedHaj", getPerformedHaj());
		attributes.put("revertedToIslam", getRevertedToIslam());
		attributes.put("muslimSince", getMuslimSince());
		attributes.put("hasNoFather", getHasNoFather());
		attributes.put("hasNoMother", getHasNoMother());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long profileId = (Long)attributes.get("profileId");

		if (profileId != null) {
			setProfileId(profileId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date ownerLastLogin = (Date)attributes.get("ownerLastLogin");

		if (ownerLastLogin != null) {
			setOwnerLastLogin(ownerLastLogin);
		}

		Integer createdFor = (Integer)attributes.get("createdFor");

		if (createdFor != null) {
			setCreatedFor(createdFor);
		}

		String profileName = (String)attributes.get("profileName");

		if (profileName != null) {
			setProfileName(profileName);
		}

		String profileCode = (String)attributes.get("profileCode");

		if (profileCode != null) {
			setProfileCode(profileCode);
		}

		Boolean bride = (Boolean)attributes.get("bride");

		if (bride != null) {
			setBride(bride);
		}

		Integer maritalStatus = (Integer)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		Integer bornOn = (Integer)attributes.get("bornOn");

		if (bornOn != null) {
			setBornOn(bornOn);
		}

		String reMarriageReasons = (String)attributes.get("reMarriageReasons");

		if (reMarriageReasons != null) {
			setReMarriageReasons(reMarriageReasons);
		}

		Boolean hasChildren = (Boolean)attributes.get("hasChildren");

		if (hasChildren != null) {
			setHasChildren(hasChildren);
		}

		Integer sons = (Integer)attributes.get("sons");

		if (sons != null) {
			setSons(sons);
		}

		Integer daughters = (Integer)attributes.get("daughters");

		if (daughters != null) {
			setDaughters(daughters);
		}

		Integer height = (Integer)attributes.get("height");

		if (height != null) {
			setHeight(height);
		}

		Integer weight = (Integer)attributes.get("weight");

		if (weight != null) {
			setWeight(weight);
		}

		Integer complexion = (Integer)attributes.get("complexion");

		if (complexion != null) {
			setComplexion(complexion);
		}

		Integer motherTongue = (Integer)attributes.get("motherTongue");

		if (motherTongue != null) {
			setMotherTongue(motherTongue);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String phone1 = (String)attributes.get("phone1");

		if (phone1 != null) {
			setPhone1(phone1);
		}

		String phone2 = (String)attributes.get("phone2");

		if (phone2 != null) {
			setPhone2(phone2);
		}

		Long residingCountry = (Long)attributes.get("residingCountry");

		if (residingCountry != null) {
			setResidingCountry(residingCountry);
		}

		Long residingState = (Long)attributes.get("residingState");

		if (residingState != null) {
			setResidingState(residingState);
		}

		Long residingCity = (Long)attributes.get("residingCity");

		if (residingCity != null) {
			setResidingCity(residingCity);
		}

		String residingArea = (String)attributes.get("residingArea");

		if (residingArea != null) {
			setResidingArea(residingArea);
		}

		String nearbyMasjid = (String)attributes.get("nearbyMasjid");

		if (nearbyMasjid != null) {
			setNearbyMasjid(nearbyMasjid);
		}

		Integer education = (Integer)attributes.get("education");

		if (education != null) {
			setEducation(education);
		}

		String educationDetail = (String)attributes.get("educationDetail");

		if (educationDetail != null) {
			setEducationDetail(educationDetail);
		}

		Integer religiousEducation = (Integer)attributes.get(
				"religiousEducation");

		if (religiousEducation != null) {
			setReligiousEducation(religiousEducation);
		}

		String religiousEducationDetail = (String)attributes.get(
				"religiousEducationDetail");

		if (religiousEducationDetail != null) {
			setReligiousEducationDetail(religiousEducationDetail);
		}

		Integer profession = (Integer)attributes.get("profession");

		if (profession != null) {
			setProfession(profession);
		}

		String professionDetail = (String)attributes.get("professionDetail");

		if (professionDetail != null) {
			setProfessionDetail(professionDetail);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		Integer currency = (Integer)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Integer monthlyIncome = (Integer)attributes.get("monthlyIncome");

		if (monthlyIncome != null) {
			setMonthlyIncome(monthlyIncome);
		}

		Long countryOfBirth = (Long)attributes.get("countryOfBirth");

		if (countryOfBirth != null) {
			setCountryOfBirth(countryOfBirth);
		}

		Long stateOfBirth = (Long)attributes.get("stateOfBirth");

		if (stateOfBirth != null) {
			setStateOfBirth(stateOfBirth);
		}

		Long cityOfBirth = (Long)attributes.get("cityOfBirth");

		if (cityOfBirth != null) {
			setCityOfBirth(cityOfBirth);
		}

		Integer community = (Integer)attributes.get("community");

		if (community != null) {
			setCommunity(community);
		}

		Integer ethnicity = (Integer)attributes.get("ethnicity");

		if (ethnicity != null) {
			setEthnicity(ethnicity);
		}

		String canSpeak = (String)attributes.get("canSpeak");

		if (canSpeak != null) {
			setCanSpeak(canSpeak);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String expectation = (String)attributes.get("expectation");

		if (expectation != null) {
			setExpectation(expectation);
		}

		String hobbies = (String)attributes.get("hobbies");

		if (hobbies != null) {
			setHobbies(hobbies);
		}

		Boolean physicallyChallenged = (Boolean)attributes.get(
				"physicallyChallenged");

		if (physicallyChallenged != null) {
			setPhysicallyChallenged(physicallyChallenged);
		}

		String physicallyChallengedDetails = (String)attributes.get(
				"physicallyChallengedDetails");

		if (physicallyChallengedDetails != null) {
			setPhysicallyChallengedDetails(physicallyChallengedDetails);
		}

		Boolean performedHaj = (Boolean)attributes.get("performedHaj");

		if (performedHaj != null) {
			setPerformedHaj(performedHaj);
		}

		Boolean revertedToIslam = (Boolean)attributes.get("revertedToIslam");

		if (revertedToIslam != null) {
			setRevertedToIslam(revertedToIslam);
		}

		Integer muslimSince = (Integer)attributes.get("muslimSince");

		if (muslimSince != null) {
			setMuslimSince(muslimSince);
		}

		Boolean hasNoFather = (Boolean)attributes.get("hasNoFather");

		if (hasNoFather != null) {
			setHasNoFather(hasNoFather);
		}

		Boolean hasNoMother = (Boolean)attributes.get("hasNoMother");

		if (hasNoMother != null) {
			setHasNoMother(hasNoMother);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getProfileId() {
		return _profileId;
	}

	@Override
	public void setProfileId(long profileId) {
		_profileId = profileId;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfileId", long.class);

				method.invoke(_profileRemoteModel, profileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_profileRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_profileRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_profileRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_profileRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_profileRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_profileRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getOwnerLastLogin() {
		return _ownerLastLogin;
	}

	@Override
	public void setOwnerLastLogin(Date ownerLastLogin) {
		_ownerLastLogin = ownerLastLogin;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerLastLogin", Date.class);

				method.invoke(_profileRemoteModel, ownerLastLogin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCreatedFor() {
		return _createdFor;
	}

	@Override
	public void setCreatedFor(int createdFor) {
		_createdFor = createdFor;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedFor", int.class);

				method.invoke(_profileRemoteModel, createdFor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfileName() {
		return _profileName;
	}

	@Override
	public void setProfileName(String profileName) {
		_profileName = profileName;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfileName", String.class);

				method.invoke(_profileRemoteModel, profileName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfileCode() {
		return _profileCode;
	}

	@Override
	public void setProfileCode(String profileCode) {
		_profileCode = profileCode;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfileCode", String.class);

				method.invoke(_profileRemoteModel, profileCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getBride() {
		return _bride;
	}

	@Override
	public boolean isBride() {
		return _bride;
	}

	@Override
	public void setBride(boolean bride) {
		_bride = bride;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setBride", boolean.class);

				method.invoke(_profileRemoteModel, bride);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaritalStatus() {
		return _maritalStatus;
	}

	@Override
	public void setMaritalStatus(int maritalStatus) {
		_maritalStatus = maritalStatus;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritalStatus", int.class);

				method.invoke(_profileRemoteModel, maritalStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBornOn() {
		return _bornOn;
	}

	@Override
	public void setBornOn(int bornOn) {
		_bornOn = bornOn;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setBornOn", int.class);

				method.invoke(_profileRemoteModel, bornOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReMarriageReasons() {
		return _reMarriageReasons;
	}

	@Override
	public void setReMarriageReasons(String reMarriageReasons) {
		_reMarriageReasons = reMarriageReasons;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setReMarriageReasons",
						String.class);

				method.invoke(_profileRemoteModel, reMarriageReasons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHasChildren() {
		return _hasChildren;
	}

	@Override
	public boolean isHasChildren() {
		return _hasChildren;
	}

	@Override
	public void setHasChildren(boolean hasChildren) {
		_hasChildren = hasChildren;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setHasChildren", boolean.class);

				method.invoke(_profileRemoteModel, hasChildren);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSons() {
		return _sons;
	}

	@Override
	public void setSons(int sons) {
		_sons = sons;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setSons", int.class);

				method.invoke(_profileRemoteModel, sons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaughters() {
		return _daughters;
	}

	@Override
	public void setDaughters(int daughters) {
		_daughters = daughters;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setDaughters", int.class);

				method.invoke(_profileRemoteModel, daughters);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHeight() {
		return _height;
	}

	@Override
	public void setHeight(int height) {
		_height = height;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setHeight", int.class);

				method.invoke(_profileRemoteModel, height);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getWeight() {
		return _weight;
	}

	@Override
	public void setWeight(int weight) {
		_weight = weight;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setWeight", int.class);

				method.invoke(_profileRemoteModel, weight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getComplexion() {
		return _complexion;
	}

	@Override
	public void setComplexion(int complexion) {
		_complexion = complexion;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setComplexion", int.class);

				method.invoke(_profileRemoteModel, complexion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMotherTongue() {
		return _motherTongue;
	}

	@Override
	public void setMotherTongue(int motherTongue) {
		_motherTongue = motherTongue;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setMotherTongue", int.class);

				method.invoke(_profileRemoteModel, motherTongue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailAddress() {
		return _emailAddress;
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailAddress", String.class);

				method.invoke(_profileRemoteModel, emailAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone1() {
		return _phone1;
	}

	@Override
	public void setPhone1(String phone1) {
		_phone1 = phone1;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone1", String.class);

				method.invoke(_profileRemoteModel, phone1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone2() {
		return _phone2;
	}

	@Override
	public void setPhone2(String phone2) {
		_phone2 = phone2;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone2", String.class);

				method.invoke(_profileRemoteModel, phone2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResidingCountry() {
		return _residingCountry;
	}

	@Override
	public void setResidingCountry(long residingCountry) {
		_residingCountry = residingCountry;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setResidingCountry", long.class);

				method.invoke(_profileRemoteModel, residingCountry);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResidingState() {
		return _residingState;
	}

	@Override
	public void setResidingState(long residingState) {
		_residingState = residingState;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setResidingState", long.class);

				method.invoke(_profileRemoteModel, residingState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResidingCity() {
		return _residingCity;
	}

	@Override
	public void setResidingCity(long residingCity) {
		_residingCity = residingCity;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setResidingCity", long.class);

				method.invoke(_profileRemoteModel, residingCity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResidingArea() {
		return _residingArea;
	}

	@Override
	public void setResidingArea(String residingArea) {
		_residingArea = residingArea;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setResidingArea", String.class);

				method.invoke(_profileRemoteModel, residingArea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNearbyMasjid() {
		return _nearbyMasjid;
	}

	@Override
	public void setNearbyMasjid(String nearbyMasjid) {
		_nearbyMasjid = nearbyMasjid;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setNearbyMasjid", String.class);

				method.invoke(_profileRemoteModel, nearbyMasjid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEducation() {
		return _education;
	}

	@Override
	public void setEducation(int education) {
		_education = education;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setEducation", int.class);

				method.invoke(_profileRemoteModel, education);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEducationDetail() {
		return _educationDetail;
	}

	@Override
	public void setEducationDetail(String educationDetail) {
		_educationDetail = educationDetail;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setEducationDetail",
						String.class);

				method.invoke(_profileRemoteModel, educationDetail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReligiousEducation() {
		return _religiousEducation;
	}

	@Override
	public void setReligiousEducation(int religiousEducation) {
		_religiousEducation = religiousEducation;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setReligiousEducation",
						int.class);

				method.invoke(_profileRemoteModel, religiousEducation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReligiousEducationDetail() {
		return _religiousEducationDetail;
	}

	@Override
	public void setReligiousEducationDetail(String religiousEducationDetail) {
		_religiousEducationDetail = religiousEducationDetail;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setReligiousEducationDetail",
						String.class);

				method.invoke(_profileRemoteModel, religiousEducationDetail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getProfession() {
		return _profession;
	}

	@Override
	public void setProfession(int profession) {
		_profession = profession;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfession", int.class);

				method.invoke(_profileRemoteModel, profession);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfessionDetail() {
		return _professionDetail;
	}

	@Override
	public void setProfessionDetail(String professionDetail) {
		_professionDetail = professionDetail;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfessionDetail",
						String.class);

				method.invoke(_profileRemoteModel, professionDetail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_profileRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(int currency) {
		_currency = currency;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", int.class);

				method.invoke(_profileRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMonthlyIncome() {
		return _monthlyIncome;
	}

	@Override
	public void setMonthlyIncome(int monthlyIncome) {
		_monthlyIncome = monthlyIncome;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setMonthlyIncome", int.class);

				method.invoke(_profileRemoteModel, monthlyIncome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountryOfBirth() {
		return _countryOfBirth;
	}

	@Override
	public void setCountryOfBirth(long countryOfBirth) {
		_countryOfBirth = countryOfBirth;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryOfBirth", long.class);

				method.invoke(_profileRemoteModel, countryOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStateOfBirth() {
		return _stateOfBirth;
	}

	@Override
	public void setStateOfBirth(long stateOfBirth) {
		_stateOfBirth = stateOfBirth;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setStateOfBirth", long.class);

				method.invoke(_profileRemoteModel, stateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCityOfBirth() {
		return _cityOfBirth;
	}

	@Override
	public void setCityOfBirth(long cityOfBirth) {
		_cityOfBirth = cityOfBirth;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCityOfBirth", long.class);

				method.invoke(_profileRemoteModel, cityOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCommunity() {
		return _community;
	}

	@Override
	public void setCommunity(int community) {
		_community = community;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCommunity", int.class);

				method.invoke(_profileRemoteModel, community);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEthnicity() {
		return _ethnicity;
	}

	@Override
	public void setEthnicity(int ethnicity) {
		_ethnicity = ethnicity;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setEthnicity", int.class);

				method.invoke(_profileRemoteModel, ethnicity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCanSpeak() {
		return _canSpeak;
	}

	@Override
	public void setCanSpeak(String canSpeak) {
		_canSpeak = canSpeak;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCanSpeak", String.class);

				method.invoke(_profileRemoteModel, canSpeak);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_profileRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExpectation() {
		return _expectation;
	}

	@Override
	public void setExpectation(String expectation) {
		_expectation = expectation;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setExpectation", String.class);

				method.invoke(_profileRemoteModel, expectation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHobbies() {
		return _hobbies;
	}

	@Override
	public void setHobbies(String hobbies) {
		_hobbies = hobbies;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setHobbies", String.class);

				method.invoke(_profileRemoteModel, hobbies);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getPhysicallyChallenged() {
		return _physicallyChallenged;
	}

	@Override
	public boolean isPhysicallyChallenged() {
		return _physicallyChallenged;
	}

	@Override
	public void setPhysicallyChallenged(boolean physicallyChallenged) {
		_physicallyChallenged = physicallyChallenged;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setPhysicallyChallenged",
						boolean.class);

				method.invoke(_profileRemoteModel, physicallyChallenged);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhysicallyChallengedDetails() {
		return _physicallyChallengedDetails;
	}

	@Override
	public void setPhysicallyChallengedDetails(
		String physicallyChallengedDetails) {
		_physicallyChallengedDetails = physicallyChallengedDetails;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setPhysicallyChallengedDetails",
						String.class);

				method.invoke(_profileRemoteModel, physicallyChallengedDetails);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getPerformedHaj() {
		return _performedHaj;
	}

	@Override
	public boolean isPerformedHaj() {
		return _performedHaj;
	}

	@Override
	public void setPerformedHaj(boolean performedHaj) {
		_performedHaj = performedHaj;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setPerformedHaj", boolean.class);

				method.invoke(_profileRemoteModel, performedHaj);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getRevertedToIslam() {
		return _revertedToIslam;
	}

	@Override
	public boolean isRevertedToIslam() {
		return _revertedToIslam;
	}

	@Override
	public void setRevertedToIslam(boolean revertedToIslam) {
		_revertedToIslam = revertedToIslam;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setRevertedToIslam",
						boolean.class);

				method.invoke(_profileRemoteModel, revertedToIslam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMuslimSince() {
		return _muslimSince;
	}

	@Override
	public void setMuslimSince(int muslimSince) {
		_muslimSince = muslimSince;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setMuslimSince", int.class);

				method.invoke(_profileRemoteModel, muslimSince);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHasNoFather() {
		return _hasNoFather;
	}

	@Override
	public boolean isHasNoFather() {
		return _hasNoFather;
	}

	@Override
	public void setHasNoFather(boolean hasNoFather) {
		_hasNoFather = hasNoFather;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setHasNoFather", boolean.class);

				method.invoke(_profileRemoteModel, hasNoFather);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHasNoMother() {
		return _hasNoMother;
	}

	@Override
	public boolean isHasNoMother() {
		return _hasNoMother;
	}

	@Override
	public void setHasNoMother(boolean hasNoMother) {
		_hasNoMother = hasNoMother;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setHasNoMother", boolean.class);

				method.invoke(_profileRemoteModel, hasNoMother);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_profileRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setDefaultLocation(com.liferay.portal.model.User user) {
		try {
			String methodName = "setDefaultLocation";

			Class<?>[] parameterTypes = new Class<?>[] {
					com.liferay.portal.model.User.class
				};

			Object[] parameterValues = new Object[] { user };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public double getComputeAge() {
		try {
			String methodName = "getComputeAge";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Double returnObj = (Double)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.String getDisplayAge() {
		try {
			String methodName = "getDisplayAge";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.lang.String returnObj = (java.lang.String)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getProfileRemoteModel() {
		return _profileRemoteModel;
	}

	public void setProfileRemoteModel(BaseModel<?> profileRemoteModel) {
		_profileRemoteModel = profileRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _profileRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_profileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProfileLocalServiceUtil.addProfile(this);
		}
		else {
			ProfileLocalServiceUtil.updateProfile(this);
		}
	}

	@Override
	public Profile toEscapedModel() {
		return (Profile)ProxyUtil.newProxyInstance(Profile.class.getClassLoader(),
			new Class[] { Profile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProfileClp clone = new ProfileClp();

		clone.setProfileId(getProfileId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setGroupId(getGroupId());
		clone.setOwnerLastLogin(getOwnerLastLogin());
		clone.setCreatedFor(getCreatedFor());
		clone.setProfileName(getProfileName());
		clone.setProfileCode(getProfileCode());
		clone.setBride(getBride());
		clone.setMaritalStatus(getMaritalStatus());
		clone.setBornOn(getBornOn());
		clone.setReMarriageReasons(getReMarriageReasons());
		clone.setHasChildren(getHasChildren());
		clone.setSons(getSons());
		clone.setDaughters(getDaughters());
		clone.setHeight(getHeight());
		clone.setWeight(getWeight());
		clone.setComplexion(getComplexion());
		clone.setMotherTongue(getMotherTongue());
		clone.setEmailAddress(getEmailAddress());
		clone.setPhone1(getPhone1());
		clone.setPhone2(getPhone2());
		clone.setResidingCountry(getResidingCountry());
		clone.setResidingState(getResidingState());
		clone.setResidingCity(getResidingCity());
		clone.setResidingArea(getResidingArea());
		clone.setNearbyMasjid(getNearbyMasjid());
		clone.setEducation(getEducation());
		clone.setEducationDetail(getEducationDetail());
		clone.setReligiousEducation(getReligiousEducation());
		clone.setReligiousEducationDetail(getReligiousEducationDetail());
		clone.setProfession(getProfession());
		clone.setProfessionDetail(getProfessionDetail());
		clone.setOrganization(getOrganization());
		clone.setCurrency(getCurrency());
		clone.setMonthlyIncome(getMonthlyIncome());
		clone.setCountryOfBirth(getCountryOfBirth());
		clone.setStateOfBirth(getStateOfBirth());
		clone.setCityOfBirth(getCityOfBirth());
		clone.setCommunity(getCommunity());
		clone.setEthnicity(getEthnicity());
		clone.setCanSpeak(getCanSpeak());
		clone.setDescription(getDescription());
		clone.setExpectation(getExpectation());
		clone.setHobbies(getHobbies());
		clone.setPhysicallyChallenged(getPhysicallyChallenged());
		clone.setPhysicallyChallengedDetails(getPhysicallyChallengedDetails());
		clone.setPerformedHaj(getPerformedHaj());
		clone.setRevertedToIslam(getRevertedToIslam());
		clone.setMuslimSince(getMuslimSince());
		clone.setHasNoFather(getHasNoFather());
		clone.setHasNoMother(getHasNoMother());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(Profile profile) {
		long primaryKey = profile.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProfileClp)) {
			return false;
		}

		ProfileClp profile = (ProfileClp)obj;

		long primaryKey = profile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(113);

		sb.append("{profileId=");
		sb.append(getProfileId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", ownerLastLogin=");
		sb.append(getOwnerLastLogin());
		sb.append(", createdFor=");
		sb.append(getCreatedFor());
		sb.append(", profileName=");
		sb.append(getProfileName());
		sb.append(", profileCode=");
		sb.append(getProfileCode());
		sb.append(", bride=");
		sb.append(getBride());
		sb.append(", maritalStatus=");
		sb.append(getMaritalStatus());
		sb.append(", bornOn=");
		sb.append(getBornOn());
		sb.append(", reMarriageReasons=");
		sb.append(getReMarriageReasons());
		sb.append(", hasChildren=");
		sb.append(getHasChildren());
		sb.append(", sons=");
		sb.append(getSons());
		sb.append(", daughters=");
		sb.append(getDaughters());
		sb.append(", height=");
		sb.append(getHeight());
		sb.append(", weight=");
		sb.append(getWeight());
		sb.append(", complexion=");
		sb.append(getComplexion());
		sb.append(", motherTongue=");
		sb.append(getMotherTongue());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", phone1=");
		sb.append(getPhone1());
		sb.append(", phone2=");
		sb.append(getPhone2());
		sb.append(", residingCountry=");
		sb.append(getResidingCountry());
		sb.append(", residingState=");
		sb.append(getResidingState());
		sb.append(", residingCity=");
		sb.append(getResidingCity());
		sb.append(", residingArea=");
		sb.append(getResidingArea());
		sb.append(", nearbyMasjid=");
		sb.append(getNearbyMasjid());
		sb.append(", education=");
		sb.append(getEducation());
		sb.append(", educationDetail=");
		sb.append(getEducationDetail());
		sb.append(", religiousEducation=");
		sb.append(getReligiousEducation());
		sb.append(", religiousEducationDetail=");
		sb.append(getReligiousEducationDetail());
		sb.append(", profession=");
		sb.append(getProfession());
		sb.append(", professionDetail=");
		sb.append(getProfessionDetail());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", monthlyIncome=");
		sb.append(getMonthlyIncome());
		sb.append(", countryOfBirth=");
		sb.append(getCountryOfBirth());
		sb.append(", stateOfBirth=");
		sb.append(getStateOfBirth());
		sb.append(", cityOfBirth=");
		sb.append(getCityOfBirth());
		sb.append(", community=");
		sb.append(getCommunity());
		sb.append(", ethnicity=");
		sb.append(getEthnicity());
		sb.append(", canSpeak=");
		sb.append(getCanSpeak());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", expectation=");
		sb.append(getExpectation());
		sb.append(", hobbies=");
		sb.append(getHobbies());
		sb.append(", physicallyChallenged=");
		sb.append(getPhysicallyChallenged());
		sb.append(", physicallyChallengedDetails=");
		sb.append(getPhysicallyChallengedDetails());
		sb.append(", performedHaj=");
		sb.append(getPerformedHaj());
		sb.append(", revertedToIslam=");
		sb.append(getRevertedToIslam());
		sb.append(", muslimSince=");
		sb.append(getMuslimSince());
		sb.append(", hasNoFather=");
		sb.append(getHasNoFather());
		sb.append(", hasNoMother=");
		sb.append(getHasNoMother());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(172);

		sb.append("<model><model-name>");
		sb.append("com.inikah.slayer.model.Profile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>profileId</column-name><column-value><![CDATA[");
		sb.append(getProfileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerLastLogin</column-name><column-value><![CDATA[");
		sb.append(getOwnerLastLogin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdFor</column-name><column-value><![CDATA[");
		sb.append(getCreatedFor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profileName</column-name><column-value><![CDATA[");
		sb.append(getProfileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profileCode</column-name><column-value><![CDATA[");
		sb.append(getProfileCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bride</column-name><column-value><![CDATA[");
		sb.append(getBride());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritalStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritalStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bornOn</column-name><column-value><![CDATA[");
		sb.append(getBornOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reMarriageReasons</column-name><column-value><![CDATA[");
		sb.append(getReMarriageReasons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasChildren</column-name><column-value><![CDATA[");
		sb.append(getHasChildren());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sons</column-name><column-value><![CDATA[");
		sb.append(getSons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daughters</column-name><column-value><![CDATA[");
		sb.append(getDaughters());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>height</column-name><column-value><![CDATA[");
		sb.append(getHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weight</column-name><column-value><![CDATA[");
		sb.append(getWeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>complexion</column-name><column-value><![CDATA[");
		sb.append(getComplexion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motherTongue</column-name><column-value><![CDATA[");
		sb.append(getMotherTongue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone1</column-name><column-value><![CDATA[");
		sb.append(getPhone1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone2</column-name><column-value><![CDATA[");
		sb.append(getPhone2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>residingCountry</column-name><column-value><![CDATA[");
		sb.append(getResidingCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>residingState</column-name><column-value><![CDATA[");
		sb.append(getResidingState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>residingCity</column-name><column-value><![CDATA[");
		sb.append(getResidingCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>residingArea</column-name><column-value><![CDATA[");
		sb.append(getResidingArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nearbyMasjid</column-name><column-value><![CDATA[");
		sb.append(getNearbyMasjid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>education</column-name><column-value><![CDATA[");
		sb.append(getEducation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>educationDetail</column-name><column-value><![CDATA[");
		sb.append(getEducationDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>religiousEducation</column-name><column-value><![CDATA[");
		sb.append(getReligiousEducation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>religiousEducationDetail</column-name><column-value><![CDATA[");
		sb.append(getReligiousEducationDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profession</column-name><column-value><![CDATA[");
		sb.append(getProfession());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>professionDetail</column-name><column-value><![CDATA[");
		sb.append(getProfessionDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>monthlyIncome</column-name><column-value><![CDATA[");
		sb.append(getMonthlyIncome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryOfBirth</column-name><column-value><![CDATA[");
		sb.append(getCountryOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getStateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityOfBirth</column-name><column-value><![CDATA[");
		sb.append(getCityOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community</column-name><column-value><![CDATA[");
		sb.append(getCommunity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ethnicity</column-name><column-value><![CDATA[");
		sb.append(getEthnicity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canSpeak</column-name><column-value><![CDATA[");
		sb.append(getCanSpeak());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expectation</column-name><column-value><![CDATA[");
		sb.append(getExpectation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hobbies</column-name><column-value><![CDATA[");
		sb.append(getHobbies());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>physicallyChallenged</column-name><column-value><![CDATA[");
		sb.append(getPhysicallyChallenged());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>physicallyChallengedDetails</column-name><column-value><![CDATA[");
		sb.append(getPhysicallyChallengedDetails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>performedHaj</column-name><column-value><![CDATA[");
		sb.append(getPerformedHaj());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revertedToIslam</column-name><column-value><![CDATA[");
		sb.append(getRevertedToIslam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>muslimSince</column-name><column-value><![CDATA[");
		sb.append(getMuslimSince());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasNoFather</column-name><column-value><![CDATA[");
		sb.append(getHasNoFather());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasNoMother</column-name><column-value><![CDATA[");
		sb.append(getHasNoMother());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _profileId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _groupId;
	private Date _ownerLastLogin;
	private int _createdFor;
	private String _profileName;
	private String _profileCode;
	private boolean _bride;
	private int _maritalStatus;
	private int _bornOn;
	private String _reMarriageReasons;
	private boolean _hasChildren;
	private int _sons;
	private int _daughters;
	private int _height;
	private int _weight;
	private int _complexion;
	private int _motherTongue;
	private String _emailAddress;
	private String _phone1;
	private String _phone2;
	private long _residingCountry;
	private long _residingState;
	private long _residingCity;
	private String _residingArea;
	private String _nearbyMasjid;
	private int _education;
	private String _educationDetail;
	private int _religiousEducation;
	private String _religiousEducationDetail;
	private int _profession;
	private String _professionDetail;
	private String _organization;
	private int _currency;
	private int _monthlyIncome;
	private long _countryOfBirth;
	private long _stateOfBirth;
	private long _cityOfBirth;
	private int _community;
	private int _ethnicity;
	private String _canSpeak;
	private String _description;
	private String _expectation;
	private String _hobbies;
	private boolean _physicallyChallenged;
	private String _physicallyChallengedDetails;
	private boolean _performedHaj;
	private boolean _revertedToIslam;
	private int _muslimSince;
	private boolean _hasNoFather;
	private boolean _hasNoMother;
	private int _status;
	private BaseModel<?> _profileRemoteModel;
}