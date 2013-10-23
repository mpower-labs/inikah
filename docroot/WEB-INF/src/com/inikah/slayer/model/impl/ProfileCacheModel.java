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

package com.inikah.slayer.model.impl;

import com.inikah.slayer.model.Profile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Profile in entity cache.
 *
 * @author Ahmed Hasan
 * @see Profile
 * @generated
 */
public class ProfileCacheModel implements CacheModel<Profile>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(113);

		sb.append("{profileId=");
		sb.append(profileId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", ownerLastLogin=");
		sb.append(ownerLastLogin);
		sb.append(", createdFor=");
		sb.append(createdFor);
		sb.append(", profileName=");
		sb.append(profileName);
		sb.append(", profileCode=");
		sb.append(profileCode);
		sb.append(", bride=");
		sb.append(bride);
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", bornOn=");
		sb.append(bornOn);
		sb.append(", reMarriageReasons=");
		sb.append(reMarriageReasons);
		sb.append(", hasChildren=");
		sb.append(hasChildren);
		sb.append(", sons=");
		sb.append(sons);
		sb.append(", daughters=");
		sb.append(daughters);
		sb.append(", height=");
		sb.append(height);
		sb.append(", weight=");
		sb.append(weight);
		sb.append(", complexion=");
		sb.append(complexion);
		sb.append(", motherTongue=");
		sb.append(motherTongue);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", phone1=");
		sb.append(phone1);
		sb.append(", phone2=");
		sb.append(phone2);
		sb.append(", residingCountry=");
		sb.append(residingCountry);
		sb.append(", residingState=");
		sb.append(residingState);
		sb.append(", residingCity=");
		sb.append(residingCity);
		sb.append(", residingArea=");
		sb.append(residingArea);
		sb.append(", nearbyMasjid=");
		sb.append(nearbyMasjid);
		sb.append(", education=");
		sb.append(education);
		sb.append(", educationDetail=");
		sb.append(educationDetail);
		sb.append(", religiousEducation=");
		sb.append(religiousEducation);
		sb.append(", religiousEducationDetail=");
		sb.append(religiousEducationDetail);
		sb.append(", profession=");
		sb.append(profession);
		sb.append(", professionDetail=");
		sb.append(professionDetail);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", monthlyIncome=");
		sb.append(monthlyIncome);
		sb.append(", countryOfBirth=");
		sb.append(countryOfBirth);
		sb.append(", stateOfBirth=");
		sb.append(stateOfBirth);
		sb.append(", cityOfBirth=");
		sb.append(cityOfBirth);
		sb.append(", community=");
		sb.append(community);
		sb.append(", ethnicity=");
		sb.append(ethnicity);
		sb.append(", canSpeak=");
		sb.append(canSpeak);
		sb.append(", description=");
		sb.append(description);
		sb.append(", expectation=");
		sb.append(expectation);
		sb.append(", hobbies=");
		sb.append(hobbies);
		sb.append(", physicallyChallenged=");
		sb.append(physicallyChallenged);
		sb.append(", physicallyChallengedDetails=");
		sb.append(physicallyChallengedDetails);
		sb.append(", performedHaj=");
		sb.append(performedHaj);
		sb.append(", revertedToIslam=");
		sb.append(revertedToIslam);
		sb.append(", muslimSince=");
		sb.append(muslimSince);
		sb.append(", hasNoFather=");
		sb.append(hasNoFather);
		sb.append(", hasNoMother=");
		sb.append(hasNoMother);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Profile toEntityModel() {
		ProfileImpl profileImpl = new ProfileImpl();

		profileImpl.setProfileId(profileId);
		profileImpl.setCompanyId(companyId);
		profileImpl.setUserId(userId);

		if (userName == null) {
			profileImpl.setUserName(StringPool.BLANK);
		}
		else {
			profileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			profileImpl.setCreateDate(null);
		}
		else {
			profileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			profileImpl.setModifiedDate(null);
		}
		else {
			profileImpl.setModifiedDate(new Date(modifiedDate));
		}

		profileImpl.setGroupId(groupId);

		if (ownerLastLogin == Long.MIN_VALUE) {
			profileImpl.setOwnerLastLogin(null);
		}
		else {
			profileImpl.setOwnerLastLogin(new Date(ownerLastLogin));
		}

		profileImpl.setCreatedFor(createdFor);

		if (profileName == null) {
			profileImpl.setProfileName(StringPool.BLANK);
		}
		else {
			profileImpl.setProfileName(profileName);
		}

		if (profileCode == null) {
			profileImpl.setProfileCode(StringPool.BLANK);
		}
		else {
			profileImpl.setProfileCode(profileCode);
		}

		profileImpl.setBride(bride);
		profileImpl.setMaritalStatus(maritalStatus);
		profileImpl.setBornOn(bornOn);

		if (reMarriageReasons == null) {
			profileImpl.setReMarriageReasons(StringPool.BLANK);
		}
		else {
			profileImpl.setReMarriageReasons(reMarriageReasons);
		}

		profileImpl.setHasChildren(hasChildren);
		profileImpl.setSons(sons);
		profileImpl.setDaughters(daughters);
		profileImpl.setHeight(height);
		profileImpl.setWeight(weight);
		profileImpl.setComplexion(complexion);
		profileImpl.setMotherTongue(motherTongue);

		if (emailAddress == null) {
			profileImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			profileImpl.setEmailAddress(emailAddress);
		}

		if (phone1 == null) {
			profileImpl.setPhone1(StringPool.BLANK);
		}
		else {
			profileImpl.setPhone1(phone1);
		}

		if (phone2 == null) {
			profileImpl.setPhone2(StringPool.BLANK);
		}
		else {
			profileImpl.setPhone2(phone2);
		}

		profileImpl.setResidingCountry(residingCountry);
		profileImpl.setResidingState(residingState);
		profileImpl.setResidingCity(residingCity);

		if (residingArea == null) {
			profileImpl.setResidingArea(StringPool.BLANK);
		}
		else {
			profileImpl.setResidingArea(residingArea);
		}

		if (nearbyMasjid == null) {
			profileImpl.setNearbyMasjid(StringPool.BLANK);
		}
		else {
			profileImpl.setNearbyMasjid(nearbyMasjid);
		}

		profileImpl.setEducation(education);

		if (educationDetail == null) {
			profileImpl.setEducationDetail(StringPool.BLANK);
		}
		else {
			profileImpl.setEducationDetail(educationDetail);
		}

		profileImpl.setReligiousEducation(religiousEducation);

		if (religiousEducationDetail == null) {
			profileImpl.setReligiousEducationDetail(StringPool.BLANK);
		}
		else {
			profileImpl.setReligiousEducationDetail(religiousEducationDetail);
		}

		profileImpl.setProfession(profession);

		if (professionDetail == null) {
			profileImpl.setProfessionDetail(StringPool.BLANK);
		}
		else {
			profileImpl.setProfessionDetail(professionDetail);
		}

		if (organization == null) {
			profileImpl.setOrganization(StringPool.BLANK);
		}
		else {
			profileImpl.setOrganization(organization);
		}

		profileImpl.setCurrency(currency);
		profileImpl.setMonthlyIncome(monthlyIncome);
		profileImpl.setCountryOfBirth(countryOfBirth);
		profileImpl.setStateOfBirth(stateOfBirth);
		profileImpl.setCityOfBirth(cityOfBirth);
		profileImpl.setCommunity(community);
		profileImpl.setEthnicity(ethnicity);

		if (canSpeak == null) {
			profileImpl.setCanSpeak(StringPool.BLANK);
		}
		else {
			profileImpl.setCanSpeak(canSpeak);
		}

		if (description == null) {
			profileImpl.setDescription(StringPool.BLANK);
		}
		else {
			profileImpl.setDescription(description);
		}

		if (expectation == null) {
			profileImpl.setExpectation(StringPool.BLANK);
		}
		else {
			profileImpl.setExpectation(expectation);
		}

		if (hobbies == null) {
			profileImpl.setHobbies(StringPool.BLANK);
		}
		else {
			profileImpl.setHobbies(hobbies);
		}

		profileImpl.setPhysicallyChallenged(physicallyChallenged);

		if (physicallyChallengedDetails == null) {
			profileImpl.setPhysicallyChallengedDetails(StringPool.BLANK);
		}
		else {
			profileImpl.setPhysicallyChallengedDetails(physicallyChallengedDetails);
		}

		profileImpl.setPerformedHaj(performedHaj);
		profileImpl.setRevertedToIslam(revertedToIslam);
		profileImpl.setMuslimSince(muslimSince);
		profileImpl.setHasNoFather(hasNoFather);
		profileImpl.setHasNoMother(hasNoMother);
		profileImpl.setStatus(status);

		profileImpl.resetOriginalValues();

		return profileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		profileId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		groupId = objectInput.readLong();
		ownerLastLogin = objectInput.readLong();
		createdFor = objectInput.readInt();
		profileName = objectInput.readUTF();
		profileCode = objectInput.readUTF();
		bride = objectInput.readBoolean();
		maritalStatus = objectInput.readInt();
		bornOn = objectInput.readInt();
		reMarriageReasons = objectInput.readUTF();
		hasChildren = objectInput.readBoolean();
		sons = objectInput.readInt();
		daughters = objectInput.readInt();
		height = objectInput.readInt();
		weight = objectInput.readInt();
		complexion = objectInput.readInt();
		motherTongue = objectInput.readInt();
		emailAddress = objectInput.readUTF();
		phone1 = objectInput.readUTF();
		phone2 = objectInput.readUTF();
		residingCountry = objectInput.readLong();
		residingState = objectInput.readLong();
		residingCity = objectInput.readLong();
		residingArea = objectInput.readUTF();
		nearbyMasjid = objectInput.readUTF();
		education = objectInput.readInt();
		educationDetail = objectInput.readUTF();
		religiousEducation = objectInput.readInt();
		religiousEducationDetail = objectInput.readUTF();
		profession = objectInput.readInt();
		professionDetail = objectInput.readUTF();
		organization = objectInput.readUTF();
		currency = objectInput.readInt();
		monthlyIncome = objectInput.readInt();
		countryOfBirth = objectInput.readLong();
		stateOfBirth = objectInput.readLong();
		cityOfBirth = objectInput.readLong();
		community = objectInput.readInt();
		ethnicity = objectInput.readInt();
		canSpeak = objectInput.readUTF();
		description = objectInput.readUTF();
		expectation = objectInput.readUTF();
		hobbies = objectInput.readUTF();
		physicallyChallenged = objectInput.readBoolean();
		physicallyChallengedDetails = objectInput.readUTF();
		performedHaj = objectInput.readBoolean();
		revertedToIslam = objectInput.readBoolean();
		muslimSince = objectInput.readInt();
		hasNoFather = objectInput.readBoolean();
		hasNoMother = objectInput.readBoolean();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(profileId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(ownerLastLogin);
		objectOutput.writeInt(createdFor);

		if (profileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profileName);
		}

		if (profileCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profileCode);
		}

		objectOutput.writeBoolean(bride);
		objectOutput.writeInt(maritalStatus);
		objectOutput.writeInt(bornOn);

		if (reMarriageReasons == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reMarriageReasons);
		}

		objectOutput.writeBoolean(hasChildren);
		objectOutput.writeInt(sons);
		objectOutput.writeInt(daughters);
		objectOutput.writeInt(height);
		objectOutput.writeInt(weight);
		objectOutput.writeInt(complexion);
		objectOutput.writeInt(motherTongue);

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (phone1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone1);
		}

		if (phone2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone2);
		}

		objectOutput.writeLong(residingCountry);
		objectOutput.writeLong(residingState);
		objectOutput.writeLong(residingCity);

		if (residingArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(residingArea);
		}

		if (nearbyMasjid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nearbyMasjid);
		}

		objectOutput.writeInt(education);

		if (educationDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(educationDetail);
		}

		objectOutput.writeInt(religiousEducation);

		if (religiousEducationDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(religiousEducationDetail);
		}

		objectOutput.writeInt(profession);

		if (professionDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(professionDetail);
		}

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		objectOutput.writeInt(currency);
		objectOutput.writeInt(monthlyIncome);
		objectOutput.writeLong(countryOfBirth);
		objectOutput.writeLong(stateOfBirth);
		objectOutput.writeLong(cityOfBirth);
		objectOutput.writeInt(community);
		objectOutput.writeInt(ethnicity);

		if (canSpeak == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(canSpeak);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (expectation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expectation);
		}

		if (hobbies == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hobbies);
		}

		objectOutput.writeBoolean(physicallyChallenged);

		if (physicallyChallengedDetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(physicallyChallengedDetails);
		}

		objectOutput.writeBoolean(performedHaj);
		objectOutput.writeBoolean(revertedToIslam);
		objectOutput.writeInt(muslimSince);
		objectOutput.writeBoolean(hasNoFather);
		objectOutput.writeBoolean(hasNoMother);
		objectOutput.writeInt(status);
	}

	public long profileId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long groupId;
	public long ownerLastLogin;
	public int createdFor;
	public String profileName;
	public String profileCode;
	public boolean bride;
	public int maritalStatus;
	public int bornOn;
	public String reMarriageReasons;
	public boolean hasChildren;
	public int sons;
	public int daughters;
	public int height;
	public int weight;
	public int complexion;
	public int motherTongue;
	public String emailAddress;
	public String phone1;
	public String phone2;
	public long residingCountry;
	public long residingState;
	public long residingCity;
	public String residingArea;
	public String nearbyMasjid;
	public int education;
	public String educationDetail;
	public int religiousEducation;
	public String religiousEducationDetail;
	public int profession;
	public String professionDetail;
	public String organization;
	public int currency;
	public int monthlyIncome;
	public long countryOfBirth;
	public long stateOfBirth;
	public long cityOfBirth;
	public int community;
	public int ethnicity;
	public String canSpeak;
	public String description;
	public String expectation;
	public String hobbies;
	public boolean physicallyChallenged;
	public String physicallyChallengedDetails;
	public boolean performedHaj;
	public boolean revertedToIslam;
	public int muslimSince;
	public boolean hasNoFather;
	public boolean hasNoMother;
	public int status;
}