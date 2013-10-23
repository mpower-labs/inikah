create table inikah_Bridge (
	recId LONG not null primary key
);

create table inikah_MMCity (
	cityId LONG not null primary key,
	regionId LONG,
	name VARCHAR(75) null
);

create table inikah_MMRegion (
	regionId LONG not null primary key,
	countryId LONG,
	isoCode VARCHAR(75) null,
	name VARCHAR(75) null
);

create table inikah_Profile (
	profileId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	groupId LONG,
	ownerLastLogin DATE null,
	createdFor INTEGER,
	profileName VARCHAR(75) null,
	profileCode VARCHAR(75) null,
	bride BOOLEAN,
	maritalStatus INTEGER,
	bornOn INTEGER,
	reMarriageReasons VARCHAR(75) null,
	hasChildren BOOLEAN,
	sons INTEGER,
	daughters INTEGER,
	height INTEGER,
	weight INTEGER,
	complexion INTEGER,
	motherTongue INTEGER,
	emailAddress VARCHAR(75) null,
	phone1 VARCHAR(75) null,
	phone2 VARCHAR(75) null,
	residingCountry LONG,
	residingState LONG,
	residingCity LONG,
	residingArea VARCHAR(75) null,
	nearbyMasjid VARCHAR(75) null,
	education INTEGER,
	educationDetail VARCHAR(75) null,
	religiousEducation INTEGER,
	religiousEducationDetail VARCHAR(75) null,
	profession INTEGER,
	professionDetail VARCHAR(75) null,
	organization VARCHAR(75) null,
	currency_ INTEGER,
	monthlyIncome INTEGER,
	countryOfBirth LONG,
	stateOfBirth LONG,
	cityOfBirth LONG,
	community INTEGER,
	ethnicity INTEGER,
	canSpeak VARCHAR(75) null,
	description VARCHAR(75) null,
	expectation VARCHAR(75) null,
	hobbies VARCHAR(75) null,
	physicallyChallenged BOOLEAN,
	physicallyChallengedDetails VARCHAR(75) null,
	performedHaj BOOLEAN,
	revertedToIslam BOOLEAN,
	muslimSince INTEGER,
	hasNoFather BOOLEAN,
	hasNoMother BOOLEAN,
	status INTEGER
);