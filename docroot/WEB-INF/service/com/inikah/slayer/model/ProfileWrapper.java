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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Profile}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Profile
 * @generated
 */
public class ProfileWrapper implements Profile, ModelWrapper<Profile> {
	public ProfileWrapper(Profile profile) {
		_profile = profile;
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

	/**
	* Returns the primary key of this profile.
	*
	* @return the primary key of this profile
	*/
	@Override
	public long getPrimaryKey() {
		return _profile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this profile.
	*
	* @param primaryKey the primary key of this profile
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_profile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the profile ID of this profile.
	*
	* @return the profile ID of this profile
	*/
	@Override
	public long getProfileId() {
		return _profile.getProfileId();
	}

	/**
	* Sets the profile ID of this profile.
	*
	* @param profileId the profile ID of this profile
	*/
	@Override
	public void setProfileId(long profileId) {
		_profile.setProfileId(profileId);
	}

	/**
	* Returns the company ID of this profile.
	*
	* @return the company ID of this profile
	*/
	@Override
	public long getCompanyId() {
		return _profile.getCompanyId();
	}

	/**
	* Sets the company ID of this profile.
	*
	* @param companyId the company ID of this profile
	*/
	@Override
	public void setCompanyId(long companyId) {
		_profile.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this profile.
	*
	* @return the user ID of this profile
	*/
	@Override
	public long getUserId() {
		return _profile.getUserId();
	}

	/**
	* Sets the user ID of this profile.
	*
	* @param userId the user ID of this profile
	*/
	@Override
	public void setUserId(long userId) {
		_profile.setUserId(userId);
	}

	/**
	* Returns the user uuid of this profile.
	*
	* @return the user uuid of this profile
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile.getUserUuid();
	}

	/**
	* Sets the user uuid of this profile.
	*
	* @param userUuid the user uuid of this profile
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_profile.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this profile.
	*
	* @return the user name of this profile
	*/
	@Override
	public java.lang.String getUserName() {
		return _profile.getUserName();
	}

	/**
	* Sets the user name of this profile.
	*
	* @param userName the user name of this profile
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_profile.setUserName(userName);
	}

	/**
	* Returns the create date of this profile.
	*
	* @return the create date of this profile
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _profile.getCreateDate();
	}

	/**
	* Sets the create date of this profile.
	*
	* @param createDate the create date of this profile
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_profile.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this profile.
	*
	* @return the modified date of this profile
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _profile.getModifiedDate();
	}

	/**
	* Sets the modified date of this profile.
	*
	* @param modifiedDate the modified date of this profile
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_profile.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the group ID of this profile.
	*
	* @return the group ID of this profile
	*/
	@Override
	public long getGroupId() {
		return _profile.getGroupId();
	}

	/**
	* Sets the group ID of this profile.
	*
	* @param groupId the group ID of this profile
	*/
	@Override
	public void setGroupId(long groupId) {
		_profile.setGroupId(groupId);
	}

	/**
	* Returns the owner last login of this profile.
	*
	* @return the owner last login of this profile
	*/
	@Override
	public java.util.Date getOwnerLastLogin() {
		return _profile.getOwnerLastLogin();
	}

	/**
	* Sets the owner last login of this profile.
	*
	* @param ownerLastLogin the owner last login of this profile
	*/
	@Override
	public void setOwnerLastLogin(java.util.Date ownerLastLogin) {
		_profile.setOwnerLastLogin(ownerLastLogin);
	}

	/**
	* Returns the created for of this profile.
	*
	* @return the created for of this profile
	*/
	@Override
	public int getCreatedFor() {
		return _profile.getCreatedFor();
	}

	/**
	* Sets the created for of this profile.
	*
	* @param createdFor the created for of this profile
	*/
	@Override
	public void setCreatedFor(int createdFor) {
		_profile.setCreatedFor(createdFor);
	}

	/**
	* Returns the profile name of this profile.
	*
	* @return the profile name of this profile
	*/
	@Override
	public java.lang.String getProfileName() {
		return _profile.getProfileName();
	}

	/**
	* Sets the profile name of this profile.
	*
	* @param profileName the profile name of this profile
	*/
	@Override
	public void setProfileName(java.lang.String profileName) {
		_profile.setProfileName(profileName);
	}

	/**
	* Returns the profile code of this profile.
	*
	* @return the profile code of this profile
	*/
	@Override
	public java.lang.String getProfileCode() {
		return _profile.getProfileCode();
	}

	/**
	* Sets the profile code of this profile.
	*
	* @param profileCode the profile code of this profile
	*/
	@Override
	public void setProfileCode(java.lang.String profileCode) {
		_profile.setProfileCode(profileCode);
	}

	/**
	* Returns the bride of this profile.
	*
	* @return the bride of this profile
	*/
	@Override
	public boolean getBride() {
		return _profile.getBride();
	}

	/**
	* Returns <code>true</code> if this profile is bride.
	*
	* @return <code>true</code> if this profile is bride; <code>false</code> otherwise
	*/
	@Override
	public boolean isBride() {
		return _profile.isBride();
	}

	/**
	* Sets whether this profile is bride.
	*
	* @param bride the bride of this profile
	*/
	@Override
	public void setBride(boolean bride) {
		_profile.setBride(bride);
	}

	/**
	* Returns the marital status of this profile.
	*
	* @return the marital status of this profile
	*/
	@Override
	public int getMaritalStatus() {
		return _profile.getMaritalStatus();
	}

	/**
	* Sets the marital status of this profile.
	*
	* @param maritalStatus the marital status of this profile
	*/
	@Override
	public void setMaritalStatus(int maritalStatus) {
		_profile.setMaritalStatus(maritalStatus);
	}

	/**
	* Returns the born on of this profile.
	*
	* @return the born on of this profile
	*/
	@Override
	public int getBornOn() {
		return _profile.getBornOn();
	}

	/**
	* Sets the born on of this profile.
	*
	* @param bornOn the born on of this profile
	*/
	@Override
	public void setBornOn(int bornOn) {
		_profile.setBornOn(bornOn);
	}

	/**
	* Returns the re marriage reasons of this profile.
	*
	* @return the re marriage reasons of this profile
	*/
	@Override
	public java.lang.String getReMarriageReasons() {
		return _profile.getReMarriageReasons();
	}

	/**
	* Sets the re marriage reasons of this profile.
	*
	* @param reMarriageReasons the re marriage reasons of this profile
	*/
	@Override
	public void setReMarriageReasons(java.lang.String reMarriageReasons) {
		_profile.setReMarriageReasons(reMarriageReasons);
	}

	/**
	* Returns the has children of this profile.
	*
	* @return the has children of this profile
	*/
	@Override
	public boolean getHasChildren() {
		return _profile.getHasChildren();
	}

	/**
	* Returns <code>true</code> if this profile is has children.
	*
	* @return <code>true</code> if this profile is has children; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasChildren() {
		return _profile.isHasChildren();
	}

	/**
	* Sets whether this profile is has children.
	*
	* @param hasChildren the has children of this profile
	*/
	@Override
	public void setHasChildren(boolean hasChildren) {
		_profile.setHasChildren(hasChildren);
	}

	/**
	* Returns the sons of this profile.
	*
	* @return the sons of this profile
	*/
	@Override
	public int getSons() {
		return _profile.getSons();
	}

	/**
	* Sets the sons of this profile.
	*
	* @param sons the sons of this profile
	*/
	@Override
	public void setSons(int sons) {
		_profile.setSons(sons);
	}

	/**
	* Returns the daughters of this profile.
	*
	* @return the daughters of this profile
	*/
	@Override
	public int getDaughters() {
		return _profile.getDaughters();
	}

	/**
	* Sets the daughters of this profile.
	*
	* @param daughters the daughters of this profile
	*/
	@Override
	public void setDaughters(int daughters) {
		_profile.setDaughters(daughters);
	}

	/**
	* Returns the height of this profile.
	*
	* @return the height of this profile
	*/
	@Override
	public int getHeight() {
		return _profile.getHeight();
	}

	/**
	* Sets the height of this profile.
	*
	* @param height the height of this profile
	*/
	@Override
	public void setHeight(int height) {
		_profile.setHeight(height);
	}

	/**
	* Returns the weight of this profile.
	*
	* @return the weight of this profile
	*/
	@Override
	public int getWeight() {
		return _profile.getWeight();
	}

	/**
	* Sets the weight of this profile.
	*
	* @param weight the weight of this profile
	*/
	@Override
	public void setWeight(int weight) {
		_profile.setWeight(weight);
	}

	/**
	* Returns the complexion of this profile.
	*
	* @return the complexion of this profile
	*/
	@Override
	public int getComplexion() {
		return _profile.getComplexion();
	}

	/**
	* Sets the complexion of this profile.
	*
	* @param complexion the complexion of this profile
	*/
	@Override
	public void setComplexion(int complexion) {
		_profile.setComplexion(complexion);
	}

	/**
	* Returns the mother tongue of this profile.
	*
	* @return the mother tongue of this profile
	*/
	@Override
	public int getMotherTongue() {
		return _profile.getMotherTongue();
	}

	/**
	* Sets the mother tongue of this profile.
	*
	* @param motherTongue the mother tongue of this profile
	*/
	@Override
	public void setMotherTongue(int motherTongue) {
		_profile.setMotherTongue(motherTongue);
	}

	/**
	* Returns the email address of this profile.
	*
	* @return the email address of this profile
	*/
	@Override
	public java.lang.String getEmailAddress() {
		return _profile.getEmailAddress();
	}

	/**
	* Sets the email address of this profile.
	*
	* @param emailAddress the email address of this profile
	*/
	@Override
	public void setEmailAddress(java.lang.String emailAddress) {
		_profile.setEmailAddress(emailAddress);
	}

	/**
	* Returns the phone1 of this profile.
	*
	* @return the phone1 of this profile
	*/
	@Override
	public java.lang.String getPhone1() {
		return _profile.getPhone1();
	}

	/**
	* Sets the phone1 of this profile.
	*
	* @param phone1 the phone1 of this profile
	*/
	@Override
	public void setPhone1(java.lang.String phone1) {
		_profile.setPhone1(phone1);
	}

	/**
	* Returns the phone2 of this profile.
	*
	* @return the phone2 of this profile
	*/
	@Override
	public java.lang.String getPhone2() {
		return _profile.getPhone2();
	}

	/**
	* Sets the phone2 of this profile.
	*
	* @param phone2 the phone2 of this profile
	*/
	@Override
	public void setPhone2(java.lang.String phone2) {
		_profile.setPhone2(phone2);
	}

	/**
	* Returns the residing country of this profile.
	*
	* @return the residing country of this profile
	*/
	@Override
	public long getResidingCountry() {
		return _profile.getResidingCountry();
	}

	/**
	* Sets the residing country of this profile.
	*
	* @param residingCountry the residing country of this profile
	*/
	@Override
	public void setResidingCountry(long residingCountry) {
		_profile.setResidingCountry(residingCountry);
	}

	/**
	* Returns the residing state of this profile.
	*
	* @return the residing state of this profile
	*/
	@Override
	public long getResidingState() {
		return _profile.getResidingState();
	}

	/**
	* Sets the residing state of this profile.
	*
	* @param residingState the residing state of this profile
	*/
	@Override
	public void setResidingState(long residingState) {
		_profile.setResidingState(residingState);
	}

	/**
	* Returns the residing city of this profile.
	*
	* @return the residing city of this profile
	*/
	@Override
	public long getResidingCity() {
		return _profile.getResidingCity();
	}

	/**
	* Sets the residing city of this profile.
	*
	* @param residingCity the residing city of this profile
	*/
	@Override
	public void setResidingCity(long residingCity) {
		_profile.setResidingCity(residingCity);
	}

	/**
	* Returns the residing area of this profile.
	*
	* @return the residing area of this profile
	*/
	@Override
	public java.lang.String getResidingArea() {
		return _profile.getResidingArea();
	}

	/**
	* Sets the residing area of this profile.
	*
	* @param residingArea the residing area of this profile
	*/
	@Override
	public void setResidingArea(java.lang.String residingArea) {
		_profile.setResidingArea(residingArea);
	}

	/**
	* Returns the nearby masjid of this profile.
	*
	* @return the nearby masjid of this profile
	*/
	@Override
	public java.lang.String getNearbyMasjid() {
		return _profile.getNearbyMasjid();
	}

	/**
	* Sets the nearby masjid of this profile.
	*
	* @param nearbyMasjid the nearby masjid of this profile
	*/
	@Override
	public void setNearbyMasjid(java.lang.String nearbyMasjid) {
		_profile.setNearbyMasjid(nearbyMasjid);
	}

	/**
	* Returns the education of this profile.
	*
	* @return the education of this profile
	*/
	@Override
	public int getEducation() {
		return _profile.getEducation();
	}

	/**
	* Sets the education of this profile.
	*
	* @param education the education of this profile
	*/
	@Override
	public void setEducation(int education) {
		_profile.setEducation(education);
	}

	/**
	* Returns the education detail of this profile.
	*
	* @return the education detail of this profile
	*/
	@Override
	public java.lang.String getEducationDetail() {
		return _profile.getEducationDetail();
	}

	/**
	* Sets the education detail of this profile.
	*
	* @param educationDetail the education detail of this profile
	*/
	@Override
	public void setEducationDetail(java.lang.String educationDetail) {
		_profile.setEducationDetail(educationDetail);
	}

	/**
	* Returns the religious education of this profile.
	*
	* @return the religious education of this profile
	*/
	@Override
	public int getReligiousEducation() {
		return _profile.getReligiousEducation();
	}

	/**
	* Sets the religious education of this profile.
	*
	* @param religiousEducation the religious education of this profile
	*/
	@Override
	public void setReligiousEducation(int religiousEducation) {
		_profile.setReligiousEducation(religiousEducation);
	}

	/**
	* Returns the religious education detail of this profile.
	*
	* @return the religious education detail of this profile
	*/
	@Override
	public java.lang.String getReligiousEducationDetail() {
		return _profile.getReligiousEducationDetail();
	}

	/**
	* Sets the religious education detail of this profile.
	*
	* @param religiousEducationDetail the religious education detail of this profile
	*/
	@Override
	public void setReligiousEducationDetail(
		java.lang.String religiousEducationDetail) {
		_profile.setReligiousEducationDetail(religiousEducationDetail);
	}

	/**
	* Returns the profession of this profile.
	*
	* @return the profession of this profile
	*/
	@Override
	public int getProfession() {
		return _profile.getProfession();
	}

	/**
	* Sets the profession of this profile.
	*
	* @param profession the profession of this profile
	*/
	@Override
	public void setProfession(int profession) {
		_profile.setProfession(profession);
	}

	/**
	* Returns the profession detail of this profile.
	*
	* @return the profession detail of this profile
	*/
	@Override
	public java.lang.String getProfessionDetail() {
		return _profile.getProfessionDetail();
	}

	/**
	* Sets the profession detail of this profile.
	*
	* @param professionDetail the profession detail of this profile
	*/
	@Override
	public void setProfessionDetail(java.lang.String professionDetail) {
		_profile.setProfessionDetail(professionDetail);
	}

	/**
	* Returns the organization of this profile.
	*
	* @return the organization of this profile
	*/
	@Override
	public java.lang.String getOrganization() {
		return _profile.getOrganization();
	}

	/**
	* Sets the organization of this profile.
	*
	* @param organization the organization of this profile
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_profile.setOrganization(organization);
	}

	/**
	* Returns the currency of this profile.
	*
	* @return the currency of this profile
	*/
	@Override
	public int getCurrency() {
		return _profile.getCurrency();
	}

	/**
	* Sets the currency of this profile.
	*
	* @param currency the currency of this profile
	*/
	@Override
	public void setCurrency(int currency) {
		_profile.setCurrency(currency);
	}

	/**
	* Returns the monthly income of this profile.
	*
	* @return the monthly income of this profile
	*/
	@Override
	public int getMonthlyIncome() {
		return _profile.getMonthlyIncome();
	}

	/**
	* Sets the monthly income of this profile.
	*
	* @param monthlyIncome the monthly income of this profile
	*/
	@Override
	public void setMonthlyIncome(int monthlyIncome) {
		_profile.setMonthlyIncome(monthlyIncome);
	}

	/**
	* Returns the country of birth of this profile.
	*
	* @return the country of birth of this profile
	*/
	@Override
	public long getCountryOfBirth() {
		return _profile.getCountryOfBirth();
	}

	/**
	* Sets the country of birth of this profile.
	*
	* @param countryOfBirth the country of birth of this profile
	*/
	@Override
	public void setCountryOfBirth(long countryOfBirth) {
		_profile.setCountryOfBirth(countryOfBirth);
	}

	/**
	* Returns the state of birth of this profile.
	*
	* @return the state of birth of this profile
	*/
	@Override
	public long getStateOfBirth() {
		return _profile.getStateOfBirth();
	}

	/**
	* Sets the state of birth of this profile.
	*
	* @param stateOfBirth the state of birth of this profile
	*/
	@Override
	public void setStateOfBirth(long stateOfBirth) {
		_profile.setStateOfBirth(stateOfBirth);
	}

	/**
	* Returns the city of birth of this profile.
	*
	* @return the city of birth of this profile
	*/
	@Override
	public long getCityOfBirth() {
		return _profile.getCityOfBirth();
	}

	/**
	* Sets the city of birth of this profile.
	*
	* @param cityOfBirth the city of birth of this profile
	*/
	@Override
	public void setCityOfBirth(long cityOfBirth) {
		_profile.setCityOfBirth(cityOfBirth);
	}

	/**
	* Returns the community of this profile.
	*
	* @return the community of this profile
	*/
	@Override
	public int getCommunity() {
		return _profile.getCommunity();
	}

	/**
	* Sets the community of this profile.
	*
	* @param community the community of this profile
	*/
	@Override
	public void setCommunity(int community) {
		_profile.setCommunity(community);
	}

	/**
	* Returns the ethnicity of this profile.
	*
	* @return the ethnicity of this profile
	*/
	@Override
	public int getEthnicity() {
		return _profile.getEthnicity();
	}

	/**
	* Sets the ethnicity of this profile.
	*
	* @param ethnicity the ethnicity of this profile
	*/
	@Override
	public void setEthnicity(int ethnicity) {
		_profile.setEthnicity(ethnicity);
	}

	/**
	* Returns the can speak of this profile.
	*
	* @return the can speak of this profile
	*/
	@Override
	public java.lang.String getCanSpeak() {
		return _profile.getCanSpeak();
	}

	/**
	* Sets the can speak of this profile.
	*
	* @param canSpeak the can speak of this profile
	*/
	@Override
	public void setCanSpeak(java.lang.String canSpeak) {
		_profile.setCanSpeak(canSpeak);
	}

	/**
	* Returns the description of this profile.
	*
	* @return the description of this profile
	*/
	@Override
	public java.lang.String getDescription() {
		return _profile.getDescription();
	}

	/**
	* Sets the description of this profile.
	*
	* @param description the description of this profile
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_profile.setDescription(description);
	}

	/**
	* Returns the expectation of this profile.
	*
	* @return the expectation of this profile
	*/
	@Override
	public java.lang.String getExpectation() {
		return _profile.getExpectation();
	}

	/**
	* Sets the expectation of this profile.
	*
	* @param expectation the expectation of this profile
	*/
	@Override
	public void setExpectation(java.lang.String expectation) {
		_profile.setExpectation(expectation);
	}

	/**
	* Returns the hobbies of this profile.
	*
	* @return the hobbies of this profile
	*/
	@Override
	public java.lang.String getHobbies() {
		return _profile.getHobbies();
	}

	/**
	* Sets the hobbies of this profile.
	*
	* @param hobbies the hobbies of this profile
	*/
	@Override
	public void setHobbies(java.lang.String hobbies) {
		_profile.setHobbies(hobbies);
	}

	/**
	* Returns the physically challenged of this profile.
	*
	* @return the physically challenged of this profile
	*/
	@Override
	public boolean getPhysicallyChallenged() {
		return _profile.getPhysicallyChallenged();
	}

	/**
	* Returns <code>true</code> if this profile is physically challenged.
	*
	* @return <code>true</code> if this profile is physically challenged; <code>false</code> otherwise
	*/
	@Override
	public boolean isPhysicallyChallenged() {
		return _profile.isPhysicallyChallenged();
	}

	/**
	* Sets whether this profile is physically challenged.
	*
	* @param physicallyChallenged the physically challenged of this profile
	*/
	@Override
	public void setPhysicallyChallenged(boolean physicallyChallenged) {
		_profile.setPhysicallyChallenged(physicallyChallenged);
	}

	/**
	* Returns the physically challenged details of this profile.
	*
	* @return the physically challenged details of this profile
	*/
	@Override
	public java.lang.String getPhysicallyChallengedDetails() {
		return _profile.getPhysicallyChallengedDetails();
	}

	/**
	* Sets the physically challenged details of this profile.
	*
	* @param physicallyChallengedDetails the physically challenged details of this profile
	*/
	@Override
	public void setPhysicallyChallengedDetails(
		java.lang.String physicallyChallengedDetails) {
		_profile.setPhysicallyChallengedDetails(physicallyChallengedDetails);
	}

	/**
	* Returns the performed haj of this profile.
	*
	* @return the performed haj of this profile
	*/
	@Override
	public boolean getPerformedHaj() {
		return _profile.getPerformedHaj();
	}

	/**
	* Returns <code>true</code> if this profile is performed haj.
	*
	* @return <code>true</code> if this profile is performed haj; <code>false</code> otherwise
	*/
	@Override
	public boolean isPerformedHaj() {
		return _profile.isPerformedHaj();
	}

	/**
	* Sets whether this profile is performed haj.
	*
	* @param performedHaj the performed haj of this profile
	*/
	@Override
	public void setPerformedHaj(boolean performedHaj) {
		_profile.setPerformedHaj(performedHaj);
	}

	/**
	* Returns the reverted to islam of this profile.
	*
	* @return the reverted to islam of this profile
	*/
	@Override
	public boolean getRevertedToIslam() {
		return _profile.getRevertedToIslam();
	}

	/**
	* Returns <code>true</code> if this profile is reverted to islam.
	*
	* @return <code>true</code> if this profile is reverted to islam; <code>false</code> otherwise
	*/
	@Override
	public boolean isRevertedToIslam() {
		return _profile.isRevertedToIslam();
	}

	/**
	* Sets whether this profile is reverted to islam.
	*
	* @param revertedToIslam the reverted to islam of this profile
	*/
	@Override
	public void setRevertedToIslam(boolean revertedToIslam) {
		_profile.setRevertedToIslam(revertedToIslam);
	}

	/**
	* Returns the muslim since of this profile.
	*
	* @return the muslim since of this profile
	*/
	@Override
	public int getMuslimSince() {
		return _profile.getMuslimSince();
	}

	/**
	* Sets the muslim since of this profile.
	*
	* @param muslimSince the muslim since of this profile
	*/
	@Override
	public void setMuslimSince(int muslimSince) {
		_profile.setMuslimSince(muslimSince);
	}

	/**
	* Returns the has no father of this profile.
	*
	* @return the has no father of this profile
	*/
	@Override
	public boolean getHasNoFather() {
		return _profile.getHasNoFather();
	}

	/**
	* Returns <code>true</code> if this profile is has no father.
	*
	* @return <code>true</code> if this profile is has no father; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasNoFather() {
		return _profile.isHasNoFather();
	}

	/**
	* Sets whether this profile is has no father.
	*
	* @param hasNoFather the has no father of this profile
	*/
	@Override
	public void setHasNoFather(boolean hasNoFather) {
		_profile.setHasNoFather(hasNoFather);
	}

	/**
	* Returns the has no mother of this profile.
	*
	* @return the has no mother of this profile
	*/
	@Override
	public boolean getHasNoMother() {
		return _profile.getHasNoMother();
	}

	/**
	* Returns <code>true</code> if this profile is has no mother.
	*
	* @return <code>true</code> if this profile is has no mother; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasNoMother() {
		return _profile.isHasNoMother();
	}

	/**
	* Sets whether this profile is has no mother.
	*
	* @param hasNoMother the has no mother of this profile
	*/
	@Override
	public void setHasNoMother(boolean hasNoMother) {
		_profile.setHasNoMother(hasNoMother);
	}

	/**
	* Returns the status of this profile.
	*
	* @return the status of this profile
	*/
	@Override
	public int getStatus() {
		return _profile.getStatus();
	}

	/**
	* Sets the status of this profile.
	*
	* @param status the status of this profile
	*/
	@Override
	public void setStatus(int status) {
		_profile.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _profile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_profile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _profile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_profile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _profile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _profile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_profile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _profile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_profile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_profile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_profile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProfileWrapper((Profile)_profile.clone());
	}

	@Override
	public int compareTo(com.inikah.slayer.model.Profile profile) {
		return _profile.compareTo(profile);
	}

	@Override
	public int hashCode() {
		return _profile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.inikah.slayer.model.Profile> toCacheModel() {
		return _profile.toCacheModel();
	}

	@Override
	public com.inikah.slayer.model.Profile toEscapedModel() {
		return new ProfileWrapper(_profile.toEscapedModel());
	}

	@Override
	public com.inikah.slayer.model.Profile toUnescapedModel() {
		return new ProfileWrapper(_profile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _profile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _profile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_profile.persist();
	}

	/**
	* @return
	*/
	@Override
	public double getComputeAge() {
		return _profile.getComputeAge();
	}

	/**
	* @return
	*/
	@Override
	public java.lang.String getDisplayAge() {
		return _profile.getDisplayAge();
	}

	@Override
	public void setDefaultLocation(com.liferay.portal.model.User user) {
		_profile.setDefaultLocation(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProfileWrapper)) {
			return false;
		}

		ProfileWrapper profileWrapper = (ProfileWrapper)obj;

		if (Validator.equals(_profile, profileWrapper._profile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Profile getWrappedProfile() {
		return _profile;
	}

	@Override
	public Profile getWrappedModel() {
		return _profile;
	}

	@Override
	public void resetOriginalValues() {
		_profile.resetOriginalValues();
	}

	private Profile _profile;
}