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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Profile service. Represents a row in the &quot;inikah_Profile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.inikah.slayer.model.impl.ProfileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.inikah.slayer.model.impl.ProfileImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Profile
 * @see com.inikah.slayer.model.impl.ProfileImpl
 * @see com.inikah.slayer.model.impl.ProfileModelImpl
 * @generated
 */
public interface ProfileModel extends BaseModel<Profile>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a profile model instance should use the {@link Profile} interface instead.
	 */

	/**
	 * Returns the primary key of this profile.
	 *
	 * @return the primary key of this profile
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this profile.
	 *
	 * @param primaryKey the primary key of this profile
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the profile ID of this profile.
	 *
	 * @return the profile ID of this profile
	 */
	public long getProfileId();

	/**
	 * Sets the profile ID of this profile.
	 *
	 * @param profileId the profile ID of this profile
	 */
	public void setProfileId(long profileId);

	/**
	 * Returns the company ID of this profile.
	 *
	 * @return the company ID of this profile
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this profile.
	 *
	 * @param companyId the company ID of this profile
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this profile.
	 *
	 * @return the user ID of this profile
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this profile.
	 *
	 * @param userId the user ID of this profile
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this profile.
	 *
	 * @return the user uuid of this profile
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this profile.
	 *
	 * @param userUuid the user uuid of this profile
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this profile.
	 *
	 * @return the user name of this profile
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this profile.
	 *
	 * @param userName the user name of this profile
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this profile.
	 *
	 * @return the create date of this profile
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this profile.
	 *
	 * @param createDate the create date of this profile
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this profile.
	 *
	 * @return the modified date of this profile
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this profile.
	 *
	 * @param modifiedDate the modified date of this profile
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the group ID of this profile.
	 *
	 * @return the group ID of this profile
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this profile.
	 *
	 * @param groupId the group ID of this profile
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the owner last login of this profile.
	 *
	 * @return the owner last login of this profile
	 */
	public Date getOwnerLastLogin();

	/**
	 * Sets the owner last login of this profile.
	 *
	 * @param ownerLastLogin the owner last login of this profile
	 */
	public void setOwnerLastLogin(Date ownerLastLogin);

	/**
	 * Returns the created for of this profile.
	 *
	 * @return the created for of this profile
	 */
	public int getCreatedFor();

	/**
	 * Sets the created for of this profile.
	 *
	 * @param createdFor the created for of this profile
	 */
	public void setCreatedFor(int createdFor);

	/**
	 * Returns the profile name of this profile.
	 *
	 * @return the profile name of this profile
	 */
	@AutoEscape
	public String getProfileName();

	/**
	 * Sets the profile name of this profile.
	 *
	 * @param profileName the profile name of this profile
	 */
	public void setProfileName(String profileName);

	/**
	 * Returns the profile code of this profile.
	 *
	 * @return the profile code of this profile
	 */
	@AutoEscape
	public String getProfileCode();

	/**
	 * Sets the profile code of this profile.
	 *
	 * @param profileCode the profile code of this profile
	 */
	public void setProfileCode(String profileCode);

	/**
	 * Returns the bride of this profile.
	 *
	 * @return the bride of this profile
	 */
	public boolean getBride();

	/**
	 * Returns <code>true</code> if this profile is bride.
	 *
	 * @return <code>true</code> if this profile is bride; <code>false</code> otherwise
	 */
	public boolean isBride();

	/**
	 * Sets whether this profile is bride.
	 *
	 * @param bride the bride of this profile
	 */
	public void setBride(boolean bride);

	/**
	 * Returns the marital status of this profile.
	 *
	 * @return the marital status of this profile
	 */
	public int getMaritalStatus();

	/**
	 * Sets the marital status of this profile.
	 *
	 * @param maritalStatus the marital status of this profile
	 */
	public void setMaritalStatus(int maritalStatus);

	/**
	 * Returns the born on of this profile.
	 *
	 * @return the born on of this profile
	 */
	public int getBornOn();

	/**
	 * Sets the born on of this profile.
	 *
	 * @param bornOn the born on of this profile
	 */
	public void setBornOn(int bornOn);

	/**
	 * Returns the re marriage reasons of this profile.
	 *
	 * @return the re marriage reasons of this profile
	 */
	@AutoEscape
	public String getReMarriageReasons();

	/**
	 * Sets the re marriage reasons of this profile.
	 *
	 * @param reMarriageReasons the re marriage reasons of this profile
	 */
	public void setReMarriageReasons(String reMarriageReasons);

	/**
	 * Returns the has children of this profile.
	 *
	 * @return the has children of this profile
	 */
	public boolean getHasChildren();

	/**
	 * Returns <code>true</code> if this profile is has children.
	 *
	 * @return <code>true</code> if this profile is has children; <code>false</code> otherwise
	 */
	public boolean isHasChildren();

	/**
	 * Sets whether this profile is has children.
	 *
	 * @param hasChildren the has children of this profile
	 */
	public void setHasChildren(boolean hasChildren);

	/**
	 * Returns the sons of this profile.
	 *
	 * @return the sons of this profile
	 */
	public int getSons();

	/**
	 * Sets the sons of this profile.
	 *
	 * @param sons the sons of this profile
	 */
	public void setSons(int sons);

	/**
	 * Returns the daughters of this profile.
	 *
	 * @return the daughters of this profile
	 */
	public int getDaughters();

	/**
	 * Sets the daughters of this profile.
	 *
	 * @param daughters the daughters of this profile
	 */
	public void setDaughters(int daughters);

	/**
	 * Returns the height of this profile.
	 *
	 * @return the height of this profile
	 */
	public int getHeight();

	/**
	 * Sets the height of this profile.
	 *
	 * @param height the height of this profile
	 */
	public void setHeight(int height);

	/**
	 * Returns the weight of this profile.
	 *
	 * @return the weight of this profile
	 */
	public int getWeight();

	/**
	 * Sets the weight of this profile.
	 *
	 * @param weight the weight of this profile
	 */
	public void setWeight(int weight);

	/**
	 * Returns the complexion of this profile.
	 *
	 * @return the complexion of this profile
	 */
	public int getComplexion();

	/**
	 * Sets the complexion of this profile.
	 *
	 * @param complexion the complexion of this profile
	 */
	public void setComplexion(int complexion);

	/**
	 * Returns the mother tongue of this profile.
	 *
	 * @return the mother tongue of this profile
	 */
	public int getMotherTongue();

	/**
	 * Sets the mother tongue of this profile.
	 *
	 * @param motherTongue the mother tongue of this profile
	 */
	public void setMotherTongue(int motherTongue);

	/**
	 * Returns the email address of this profile.
	 *
	 * @return the email address of this profile
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this profile.
	 *
	 * @param emailAddress the email address of this profile
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the phone1 of this profile.
	 *
	 * @return the phone1 of this profile
	 */
	@AutoEscape
	public String getPhone1();

	/**
	 * Sets the phone1 of this profile.
	 *
	 * @param phone1 the phone1 of this profile
	 */
	public void setPhone1(String phone1);

	/**
	 * Returns the phone2 of this profile.
	 *
	 * @return the phone2 of this profile
	 */
	@AutoEscape
	public String getPhone2();

	/**
	 * Sets the phone2 of this profile.
	 *
	 * @param phone2 the phone2 of this profile
	 */
	public void setPhone2(String phone2);

	/**
	 * Returns the residing country of this profile.
	 *
	 * @return the residing country of this profile
	 */
	public long getResidingCountry();

	/**
	 * Sets the residing country of this profile.
	 *
	 * @param residingCountry the residing country of this profile
	 */
	public void setResidingCountry(long residingCountry);

	/**
	 * Returns the residing state of this profile.
	 *
	 * @return the residing state of this profile
	 */
	public long getResidingState();

	/**
	 * Sets the residing state of this profile.
	 *
	 * @param residingState the residing state of this profile
	 */
	public void setResidingState(long residingState);

	/**
	 * Returns the residing city of this profile.
	 *
	 * @return the residing city of this profile
	 */
	public long getResidingCity();

	/**
	 * Sets the residing city of this profile.
	 *
	 * @param residingCity the residing city of this profile
	 */
	public void setResidingCity(long residingCity);

	/**
	 * Returns the residing area of this profile.
	 *
	 * @return the residing area of this profile
	 */
	@AutoEscape
	public String getResidingArea();

	/**
	 * Sets the residing area of this profile.
	 *
	 * @param residingArea the residing area of this profile
	 */
	public void setResidingArea(String residingArea);

	/**
	 * Returns the nearby masjid of this profile.
	 *
	 * @return the nearby masjid of this profile
	 */
	@AutoEscape
	public String getNearbyMasjid();

	/**
	 * Sets the nearby masjid of this profile.
	 *
	 * @param nearbyMasjid the nearby masjid of this profile
	 */
	public void setNearbyMasjid(String nearbyMasjid);

	/**
	 * Returns the education of this profile.
	 *
	 * @return the education of this profile
	 */
	public int getEducation();

	/**
	 * Sets the education of this profile.
	 *
	 * @param education the education of this profile
	 */
	public void setEducation(int education);

	/**
	 * Returns the education detail of this profile.
	 *
	 * @return the education detail of this profile
	 */
	@AutoEscape
	public String getEducationDetail();

	/**
	 * Sets the education detail of this profile.
	 *
	 * @param educationDetail the education detail of this profile
	 */
	public void setEducationDetail(String educationDetail);

	/**
	 * Returns the religious education of this profile.
	 *
	 * @return the religious education of this profile
	 */
	public int getReligiousEducation();

	/**
	 * Sets the religious education of this profile.
	 *
	 * @param religiousEducation the religious education of this profile
	 */
	public void setReligiousEducation(int religiousEducation);

	/**
	 * Returns the religious education detail of this profile.
	 *
	 * @return the religious education detail of this profile
	 */
	@AutoEscape
	public String getReligiousEducationDetail();

	/**
	 * Sets the religious education detail of this profile.
	 *
	 * @param religiousEducationDetail the religious education detail of this profile
	 */
	public void setReligiousEducationDetail(String religiousEducationDetail);

	/**
	 * Returns the profession of this profile.
	 *
	 * @return the profession of this profile
	 */
	public int getProfession();

	/**
	 * Sets the profession of this profile.
	 *
	 * @param profession the profession of this profile
	 */
	public void setProfession(int profession);

	/**
	 * Returns the profession detail of this profile.
	 *
	 * @return the profession detail of this profile
	 */
	@AutoEscape
	public String getProfessionDetail();

	/**
	 * Sets the profession detail of this profile.
	 *
	 * @param professionDetail the profession detail of this profile
	 */
	public void setProfessionDetail(String professionDetail);

	/**
	 * Returns the organization of this profile.
	 *
	 * @return the organization of this profile
	 */
	@AutoEscape
	public String getOrganization();

	/**
	 * Sets the organization of this profile.
	 *
	 * @param organization the organization of this profile
	 */
	public void setOrganization(String organization);

	/**
	 * Returns the currency of this profile.
	 *
	 * @return the currency of this profile
	 */
	public int getCurrency();

	/**
	 * Sets the currency of this profile.
	 *
	 * @param currency the currency of this profile
	 */
	public void setCurrency(int currency);

	/**
	 * Returns the monthly income of this profile.
	 *
	 * @return the monthly income of this profile
	 */
	public int getMonthlyIncome();

	/**
	 * Sets the monthly income of this profile.
	 *
	 * @param monthlyIncome the monthly income of this profile
	 */
	public void setMonthlyIncome(int monthlyIncome);

	/**
	 * Returns the country of birth of this profile.
	 *
	 * @return the country of birth of this profile
	 */
	public long getCountryOfBirth();

	/**
	 * Sets the country of birth of this profile.
	 *
	 * @param countryOfBirth the country of birth of this profile
	 */
	public void setCountryOfBirth(long countryOfBirth);

	/**
	 * Returns the state of birth of this profile.
	 *
	 * @return the state of birth of this profile
	 */
	public long getStateOfBirth();

	/**
	 * Sets the state of birth of this profile.
	 *
	 * @param stateOfBirth the state of birth of this profile
	 */
	public void setStateOfBirth(long stateOfBirth);

	/**
	 * Returns the city of birth of this profile.
	 *
	 * @return the city of birth of this profile
	 */
	public long getCityOfBirth();

	/**
	 * Sets the city of birth of this profile.
	 *
	 * @param cityOfBirth the city of birth of this profile
	 */
	public void setCityOfBirth(long cityOfBirth);

	/**
	 * Returns the community of this profile.
	 *
	 * @return the community of this profile
	 */
	public int getCommunity();

	/**
	 * Sets the community of this profile.
	 *
	 * @param community the community of this profile
	 */
	public void setCommunity(int community);

	/**
	 * Returns the ethnicity of this profile.
	 *
	 * @return the ethnicity of this profile
	 */
	public int getEthnicity();

	/**
	 * Sets the ethnicity of this profile.
	 *
	 * @param ethnicity the ethnicity of this profile
	 */
	public void setEthnicity(int ethnicity);

	/**
	 * Returns the can speak of this profile.
	 *
	 * @return the can speak of this profile
	 */
	@AutoEscape
	public String getCanSpeak();

	/**
	 * Sets the can speak of this profile.
	 *
	 * @param canSpeak the can speak of this profile
	 */
	public void setCanSpeak(String canSpeak);

	/**
	 * Returns the description of this profile.
	 *
	 * @return the description of this profile
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this profile.
	 *
	 * @param description the description of this profile
	 */
	public void setDescription(String description);

	/**
	 * Returns the expectation of this profile.
	 *
	 * @return the expectation of this profile
	 */
	@AutoEscape
	public String getExpectation();

	/**
	 * Sets the expectation of this profile.
	 *
	 * @param expectation the expectation of this profile
	 */
	public void setExpectation(String expectation);

	/**
	 * Returns the hobbies of this profile.
	 *
	 * @return the hobbies of this profile
	 */
	@AutoEscape
	public String getHobbies();

	/**
	 * Sets the hobbies of this profile.
	 *
	 * @param hobbies the hobbies of this profile
	 */
	public void setHobbies(String hobbies);

	/**
	 * Returns the physically challenged of this profile.
	 *
	 * @return the physically challenged of this profile
	 */
	public boolean getPhysicallyChallenged();

	/**
	 * Returns <code>true</code> if this profile is physically challenged.
	 *
	 * @return <code>true</code> if this profile is physically challenged; <code>false</code> otherwise
	 */
	public boolean isPhysicallyChallenged();

	/**
	 * Sets whether this profile is physically challenged.
	 *
	 * @param physicallyChallenged the physically challenged of this profile
	 */
	public void setPhysicallyChallenged(boolean physicallyChallenged);

	/**
	 * Returns the physically challenged details of this profile.
	 *
	 * @return the physically challenged details of this profile
	 */
	@AutoEscape
	public String getPhysicallyChallengedDetails();

	/**
	 * Sets the physically challenged details of this profile.
	 *
	 * @param physicallyChallengedDetails the physically challenged details of this profile
	 */
	public void setPhysicallyChallengedDetails(
		String physicallyChallengedDetails);

	/**
	 * Returns the performed haj of this profile.
	 *
	 * @return the performed haj of this profile
	 */
	public boolean getPerformedHaj();

	/**
	 * Returns <code>true</code> if this profile is performed haj.
	 *
	 * @return <code>true</code> if this profile is performed haj; <code>false</code> otherwise
	 */
	public boolean isPerformedHaj();

	/**
	 * Sets whether this profile is performed haj.
	 *
	 * @param performedHaj the performed haj of this profile
	 */
	public void setPerformedHaj(boolean performedHaj);

	/**
	 * Returns the reverted to islam of this profile.
	 *
	 * @return the reverted to islam of this profile
	 */
	public boolean getRevertedToIslam();

	/**
	 * Returns <code>true</code> if this profile is reverted to islam.
	 *
	 * @return <code>true</code> if this profile is reverted to islam; <code>false</code> otherwise
	 */
	public boolean isRevertedToIslam();

	/**
	 * Sets whether this profile is reverted to islam.
	 *
	 * @param revertedToIslam the reverted to islam of this profile
	 */
	public void setRevertedToIslam(boolean revertedToIslam);

	/**
	 * Returns the muslim since of this profile.
	 *
	 * @return the muslim since of this profile
	 */
	public int getMuslimSince();

	/**
	 * Sets the muslim since of this profile.
	 *
	 * @param muslimSince the muslim since of this profile
	 */
	public void setMuslimSince(int muslimSince);

	/**
	 * Returns the has no father of this profile.
	 *
	 * @return the has no father of this profile
	 */
	public boolean getHasNoFather();

	/**
	 * Returns <code>true</code> if this profile is has no father.
	 *
	 * @return <code>true</code> if this profile is has no father; <code>false</code> otherwise
	 */
	public boolean isHasNoFather();

	/**
	 * Sets whether this profile is has no father.
	 *
	 * @param hasNoFather the has no father of this profile
	 */
	public void setHasNoFather(boolean hasNoFather);

	/**
	 * Returns the has no mother of this profile.
	 *
	 * @return the has no mother of this profile
	 */
	public boolean getHasNoMother();

	/**
	 * Returns <code>true</code> if this profile is has no mother.
	 *
	 * @return <code>true</code> if this profile is has no mother; <code>false</code> otherwise
	 */
	public boolean isHasNoMother();

	/**
	 * Sets whether this profile is has no mother.
	 *
	 * @param hasNoMother the has no mother of this profile
	 */
	public void setHasNoMother(boolean hasNoMother);

	/**
	 * Returns the status of this profile.
	 *
	 * @return the status of this profile
	 */
	public int getStatus();

	/**
	 * Sets the status of this profile.
	 *
	 * @param status the status of this profile
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Profile profile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Profile> toCacheModel();

	@Override
	public Profile toEscapedModel();

	@Override
	public Profile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}