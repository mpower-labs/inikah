create index IX_797EE9C5 on inikah_MMCity (regionId);
create index IX_88B211C4 on inikah_MMCity (regionId, name);

create index IX_81C9F4F6 on inikah_MMRegion (countryId);
create index IX_C56A28C on inikah_MMRegion (countryId, isoCode);

create index IX_3D635B8 on inikah_Profile (userId);
create index IX_2390D064 on inikah_Profile (userId, emailAddress);