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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.inikah.slayer.service.http.ProfileServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.inikah.slayer.service.http.ProfileServiceSoap
 * @generated
 */
public class ProfileSoap implements Serializable {
	public static ProfileSoap toSoapModel(Profile model) {
		ProfileSoap soapModel = new ProfileSoap();

		soapModel.setProfileId(model.getProfileId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setOwnerLastLogin(model.getOwnerLastLogin());
		soapModel.setCreatedFor(model.getCreatedFor());
		soapModel.setProfileName(model.getProfileName());
		soapModel.setProfileCode(model.getProfileCode());
		soapModel.setBride(model.getBride());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setBornOn(model.getBornOn());
		soapModel.setReMarriageReasons(model.getReMarriageReasons());
		soapModel.setHasChildren(model.getHasChildren());
		soapModel.setSons(model.getSons());
		soapModel.setDaughters(model.getDaughters());
		soapModel.setHeight(model.getHeight());
		soapModel.setWeight(model.getWeight());
		soapModel.setComplexion(model.getComplexion());
		soapModel.setMotherTongue(model.getMotherTongue());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setPhone1(model.getPhone1());
		soapModel.setPhone2(model.getPhone2());
		soapModel.setResidingCountry(model.getResidingCountry());
		soapModel.setResidingState(model.getResidingState());
		soapModel.setResidingCity(model.getResidingCity());
		soapModel.setResidingArea(model.getResidingArea());
		soapModel.setNearbyMasjid(model.getNearbyMasjid());
		soapModel.setEducation(model.getEducation());
		soapModel.setEducationDetail(model.getEducationDetail());
		soapModel.setReligiousEducation(model.getReligiousEducation());
		soapModel.setReligiousEducationDetail(model.getReligiousEducationDetail());
		soapModel.setProfession(model.getProfession());
		soapModel.setProfessionDetail(model.getProfessionDetail());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setMonthlyIncome(model.getMonthlyIncome());
		soapModel.setCountryOfBirth(model.getCountryOfBirth());
		soapModel.setStateOfBirth(model.getStateOfBirth());
		soapModel.setCityOfBirth(model.getCityOfBirth());
		soapModel.setCommunity(model.getCommunity());
		soapModel.setEthnicity(model.getEthnicity());
		soapModel.setCanSpeak(model.getCanSpeak());
		soapModel.setDescription(model.getDescription());
		soapModel.setExpectation(model.getExpectation());
		soapModel.setHobbies(model.getHobbies());
		soapModel.setPhysicallyChallenged(model.getPhysicallyChallenged());
		soapModel.setPhysicallyChallengedDetails(model.getPhysicallyChallengedDetails());
		soapModel.setPerformedHaj(model.getPerformedHaj());
		soapModel.setRevertedToIslam(model.getRevertedToIslam());
		soapModel.setMuslimSince(model.getMuslimSince());
		soapModel.setHasNoFather(model.getHasNoFather());
		soapModel.setHasNoMother(model.getHasNoMother());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ProfileSoap[] toSoapModels(Profile[] models) {
		ProfileSoap[] soapModels = new ProfileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProfileSoap[][] toSoapModels(Profile[][] models) {
		ProfileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProfileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProfileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProfileSoap[] toSoapModels(List<Profile> models) {
		List<ProfileSoap> soapModels = new ArrayList<ProfileSoap>(models.size());

		for (Profile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProfileSoap[soapModels.size()]);
	}

	public ProfileSoap() {
	}

	public long getPrimaryKey() {
		return _profileId;
	}

	public void setPrimaryKey(long pk) {
		setProfileId(pk);
	}

	public long getProfileId() {
		return _profileId;
	}

	public void setProfileId(long profileId) {
		_profileId = profileId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getOwnerLastLogin() {
		return _ownerLastLogin;
	}

	public void setOwnerLastLogin(Date ownerLastLogin) {
		_ownerLastLogin = ownerLastLogin;
	}

	public int getCreatedFor() {
		return _createdFor;
	}

	public void setCreatedFor(int createdFor) {
		_createdFor = createdFor;
	}

	public String getProfileName() {
		return _profileName;
	}

	public void setProfileName(String profileName) {
		_profileName = profileName;
	}

	public String getProfileCode() {
		return _profileCode;
	}

	public void setProfileCode(String profileCode) {
		_profileCode = profileCode;
	}

	public boolean getBride() {
		return _bride;
	}

	public boolean isBride() {
		return _bride;
	}

	public void setBride(boolean bride) {
		_bride = bride;
	}

	public int getMaritalStatus() {
		return _maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		_maritalStatus = maritalStatus;
	}

	public int getBornOn() {
		return _bornOn;
	}

	public void setBornOn(int bornOn) {
		_bornOn = bornOn;
	}

	public String getReMarriageReasons() {
		return _reMarriageReasons;
	}

	public void setReMarriageReasons(String reMarriageReasons) {
		_reMarriageReasons = reMarriageReasons;
	}

	public boolean getHasChildren() {
		return _hasChildren;
	}

	public boolean isHasChildren() {
		return _hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		_hasChildren = hasChildren;
	}

	public int getSons() {
		return _sons;
	}

	public void setSons(int sons) {
		_sons = sons;
	}

	public int getDaughters() {
		return _daughters;
	}

	public void setDaughters(int daughters) {
		_daughters = daughters;
	}

	public int getHeight() {
		return _height;
	}

	public void setHeight(int height) {
		_height = height;
	}

	public int getWeight() {
		return _weight;
	}

	public void setWeight(int weight) {
		_weight = weight;
	}

	public int getComplexion() {
		return _complexion;
	}

	public void setComplexion(int complexion) {
		_complexion = complexion;
	}

	public int getMotherTongue() {
		return _motherTongue;
	}

	public void setMotherTongue(int motherTongue) {
		_motherTongue = motherTongue;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getPhone1() {
		return _phone1;
	}

	public void setPhone1(String phone1) {
		_phone1 = phone1;
	}

	public String getPhone2() {
		return _phone2;
	}

	public void setPhone2(String phone2) {
		_phone2 = phone2;
	}

	public long getResidingCountry() {
		return _residingCountry;
	}

	public void setResidingCountry(long residingCountry) {
		_residingCountry = residingCountry;
	}

	public long getResidingState() {
		return _residingState;
	}

	public void setResidingState(long residingState) {
		_residingState = residingState;
	}

	public long getResidingCity() {
		return _residingCity;
	}

	public void setResidingCity(long residingCity) {
		_residingCity = residingCity;
	}

	public String getResidingArea() {
		return _residingArea;
	}

	public void setResidingArea(String residingArea) {
		_residingArea = residingArea;
	}

	public String getNearbyMasjid() {
		return _nearbyMasjid;
	}

	public void setNearbyMasjid(String nearbyMasjid) {
		_nearbyMasjid = nearbyMasjid;
	}

	public int getEducation() {
		return _education;
	}

	public void setEducation(int education) {
		_education = education;
	}

	public String getEducationDetail() {
		return _educationDetail;
	}

	public void setEducationDetail(String educationDetail) {
		_educationDetail = educationDetail;
	}

	public int getReligiousEducation() {
		return _religiousEducation;
	}

	public void setReligiousEducation(int religiousEducation) {
		_religiousEducation = religiousEducation;
	}

	public String getReligiousEducationDetail() {
		return _religiousEducationDetail;
	}

	public void setReligiousEducationDetail(String religiousEducationDetail) {
		_religiousEducationDetail = religiousEducationDetail;
	}

	public int getProfession() {
		return _profession;
	}

	public void setProfession(int profession) {
		_profession = profession;
	}

	public String getProfessionDetail() {
		return _professionDetail;
	}

	public void setProfessionDetail(String professionDetail) {
		_professionDetail = professionDetail;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public int getCurrency() {
		return _currency;
	}

	public void setCurrency(int currency) {
		_currency = currency;
	}

	public int getMonthlyIncome() {
		return _monthlyIncome;
	}

	public void setMonthlyIncome(int monthlyIncome) {
		_monthlyIncome = monthlyIncome;
	}

	public long getCountryOfBirth() {
		return _countryOfBirth;
	}

	public void setCountryOfBirth(long countryOfBirth) {
		_countryOfBirth = countryOfBirth;
	}

	public long getStateOfBirth() {
		return _stateOfBirth;
	}

	public void setStateOfBirth(long stateOfBirth) {
		_stateOfBirth = stateOfBirth;
	}

	public long getCityOfBirth() {
		return _cityOfBirth;
	}

	public void setCityOfBirth(long cityOfBirth) {
		_cityOfBirth = cityOfBirth;
	}

	public int getCommunity() {
		return _community;
	}

	public void setCommunity(int community) {
		_community = community;
	}

	public int getEthnicity() {
		return _ethnicity;
	}

	public void setEthnicity(int ethnicity) {
		_ethnicity = ethnicity;
	}

	public String getCanSpeak() {
		return _canSpeak;
	}

	public void setCanSpeak(String canSpeak) {
		_canSpeak = canSpeak;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getExpectation() {
		return _expectation;
	}

	public void setExpectation(String expectation) {
		_expectation = expectation;
	}

	public String getHobbies() {
		return _hobbies;
	}

	public void setHobbies(String hobbies) {
		_hobbies = hobbies;
	}

	public boolean getPhysicallyChallenged() {
		return _physicallyChallenged;
	}

	public boolean isPhysicallyChallenged() {
		return _physicallyChallenged;
	}

	public void setPhysicallyChallenged(boolean physicallyChallenged) {
		_physicallyChallenged = physicallyChallenged;
	}

	public String getPhysicallyChallengedDetails() {
		return _physicallyChallengedDetails;
	}

	public void setPhysicallyChallengedDetails(
		String physicallyChallengedDetails) {
		_physicallyChallengedDetails = physicallyChallengedDetails;
	}

	public boolean getPerformedHaj() {
		return _performedHaj;
	}

	public boolean isPerformedHaj() {
		return _performedHaj;
	}

	public void setPerformedHaj(boolean performedHaj) {
		_performedHaj = performedHaj;
	}

	public boolean getRevertedToIslam() {
		return _revertedToIslam;
	}

	public boolean isRevertedToIslam() {
		return _revertedToIslam;
	}

	public void setRevertedToIslam(boolean revertedToIslam) {
		_revertedToIslam = revertedToIslam;
	}

	public int getMuslimSince() {
		return _muslimSince;
	}

	public void setMuslimSince(int muslimSince) {
		_muslimSince = muslimSince;
	}

	public boolean getHasNoFather() {
		return _hasNoFather;
	}

	public boolean isHasNoFather() {
		return _hasNoFather;
	}

	public void setHasNoFather(boolean hasNoFather) {
		_hasNoFather = hasNoFather;
	}

	public boolean getHasNoMother() {
		return _hasNoMother;
	}

	public boolean isHasNoMother() {
		return _hasNoMother;
	}

	public void setHasNoMother(boolean hasNoMother) {
		_hasNoMother = hasNoMother;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _profileId;
	private long _companyId;
	private long _userId;
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
}