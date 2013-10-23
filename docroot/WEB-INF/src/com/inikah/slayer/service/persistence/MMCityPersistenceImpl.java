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

package com.inikah.slayer.service.persistence;

import com.inikah.slayer.NoSuchMMCityException;
import com.inikah.slayer.model.MMCity;
import com.inikah.slayer.model.impl.MMCityImpl;
import com.inikah.slayer.model.impl.MMCityModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the m m city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMCityPersistence
 * @see MMCityUtil
 * @generated
 */
public class MMCityPersistenceImpl extends BasePersistenceImpl<MMCity>
	implements MMCityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MMCityUtil} to access the m m city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MMCityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, MMCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, MMCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REGIONID_NAME = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, MMCityImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRegionId_Name",
			new String[] { Long.class.getName(), String.class.getName() },
			MMCityModelImpl.REGIONID_COLUMN_BITMASK |
			MMCityModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGIONID_NAME = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegionId_Name",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the m m city where regionId = &#63; and name = &#63; or throws a {@link com.inikah.slayer.NoSuchMMCityException} if it could not be found.
	 *
	 * @param regionId the region ID
	 * @param name the name
	 * @return the matching m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity findByRegionId_Name(long regionId, String name)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = fetchByRegionId_Name(regionId, name);

		if (mmCity == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("regionId=");
			msg.append(regionId);

			msg.append(", name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMMCityException(msg.toString());
		}

		return mmCity;
	}

	/**
	 * Returns the m m city where regionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param regionId the region ID
	 * @param name the name
	 * @return the matching m m city, or <code>null</code> if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByRegionId_Name(long regionId, String name)
		throws SystemException {
		return fetchByRegionId_Name(regionId, name, true);
	}

	/**
	 * Returns the m m city where regionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param regionId the region ID
	 * @param name the name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching m m city, or <code>null</code> if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByRegionId_Name(long regionId, String name,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { regionId, name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
					finderArgs, this);
		}

		if (result instanceof MMCity) {
			MMCity mmCity = (MMCity)result;

			if ((regionId != mmCity.getRegionId()) ||
					!Validator.equals(name, mmCity.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MMCITY_WHERE);

			query.append(_FINDER_COLUMN_REGIONID_NAME_REGIONID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(regionId);

				if (bindName) {
					qPos.add(name);
				}

				List<MMCity> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MMCityPersistenceImpl.fetchByRegionId_Name(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MMCity mmCity = list.get(0);

					result = mmCity;

					cacheResult(mmCity);

					if ((mmCity.getRegionId() != regionId) ||
							(mmCity.getName() == null) ||
							!mmCity.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
							finderArgs, mmCity);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MMCity)result;
		}
	}

	/**
	 * Removes the m m city where regionId = &#63; and name = &#63; from the database.
	 *
	 * @param regionId the region ID
	 * @param name the name
	 * @return the m m city that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity removeByRegionId_Name(long regionId, String name)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = findByRegionId_Name(regionId, name);

		return remove(mmCity);
	}

	/**
	 * Returns the number of m m cities where regionId = &#63; and name = &#63;.
	 *
	 * @param regionId the region ID
	 * @param name the name
	 * @return the number of matching m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegionId_Name(long regionId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONID_NAME;

		Object[] finderArgs = new Object[] { regionId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MMCITY_WHERE);

			query.append(_FINDER_COLUMN_REGIONID_NAME_REGIONID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_REGIONID_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(regionId);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGIONID_NAME_REGIONID_2 = "mmCity.regionId = ? AND ";
	private static final String _FINDER_COLUMN_REGIONID_NAME_NAME_1 = "mmCity.name IS NULL";
	private static final String _FINDER_COLUMN_REGIONID_NAME_NAME_2 = "mmCity.name = ?";
	private static final String _FINDER_COLUMN_REGIONID_NAME_NAME_3 = "(mmCity.name IS NULL OR mmCity.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONID = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, MMCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRegionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID =
		new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, MMCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRegionId",
			new String[] { Long.class.getName() },
			MMCityModelImpl.REGIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGIONID = new FinderPath(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the m m cities where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the matching m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findByRegionId(long regionId) throws SystemException {
		return findByRegionId(regionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the m m cities where regionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param regionId the region ID
	 * @param start the lower bound of the range of m m cities
	 * @param end the upper bound of the range of m m cities (not inclusive)
	 * @return the range of matching m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findByRegionId(long regionId, int start, int end)
		throws SystemException {
		return findByRegionId(regionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the m m cities where regionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param regionId the region ID
	 * @param start the lower bound of the range of m m cities
	 * @param end the upper bound of the range of m m cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findByRegionId(long regionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID;
			finderArgs = new Object[] { regionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONID;
			finderArgs = new Object[] { regionId, start, end, orderByComparator };
		}

		List<MMCity> list = (List<MMCity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MMCity mmCity : list) {
				if ((regionId != mmCity.getRegionId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MMCITY_WHERE);

			query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MMCityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(regionId);

				if (!pagination) {
					list = (List<MMCity>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MMCity>(list);
				}
				else {
					list = (List<MMCity>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first m m city in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity findByRegionId_First(long regionId,
		OrderByComparator orderByComparator)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = fetchByRegionId_First(regionId, orderByComparator);

		if (mmCity != null) {
			return mmCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("regionId=");
		msg.append(regionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMMCityException(msg.toString());
	}

	/**
	 * Returns the first m m city in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m m city, or <code>null</code> if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByRegionId_First(long regionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MMCity> list = findByRegionId(regionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last m m city in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity findByRegionId_Last(long regionId,
		OrderByComparator orderByComparator)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = fetchByRegionId_Last(regionId, orderByComparator);

		if (mmCity != null) {
			return mmCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("regionId=");
		msg.append(regionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMMCityException(msg.toString());
	}

	/**
	 * Returns the last m m city in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m m city, or <code>null</code> if a matching m m city could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByRegionId_Last(long regionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRegionId(regionId);

		if (count == 0) {
			return null;
		}

		List<MMCity> list = findByRegionId(regionId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the m m cities before and after the current m m city in the ordered set where regionId = &#63;.
	 *
	 * @param cityId the primary key of the current m m city
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity[] findByRegionId_PrevAndNext(long cityId, long regionId,
		OrderByComparator orderByComparator)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = findByPrimaryKey(cityId);

		Session session = null;

		try {
			session = openSession();

			MMCity[] array = new MMCityImpl[3];

			array[0] = getByRegionId_PrevAndNext(session, mmCity, regionId,
					orderByComparator, true);

			array[1] = mmCity;

			array[2] = getByRegionId_PrevAndNext(session, mmCity, regionId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MMCity getByRegionId_PrevAndNext(Session session, MMCity mmCity,
		long regionId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MMCITY_WHERE);

		query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MMCityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(regionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mmCity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MMCity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the m m cities where regionId = &#63; from the database.
	 *
	 * @param regionId the region ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegionId(long regionId) throws SystemException {
		for (MMCity mmCity : findByRegionId(regionId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(mmCity);
		}
	}

	/**
	 * Returns the number of m m cities where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the number of matching m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegionId(long regionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONID;

		Object[] finderArgs = new Object[] { regionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MMCITY_WHERE);

			query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(regionId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGIONID_REGIONID_2 = "mmCity.regionId = ?";

	public MMCityPersistenceImpl() {
		setModelClass(MMCity.class);
	}

	/**
	 * Caches the m m city in the entity cache if it is enabled.
	 *
	 * @param mmCity the m m city
	 */
	@Override
	public void cacheResult(MMCity mmCity) {
		EntityCacheUtil.putResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityImpl.class, mmCity.getPrimaryKey(), mmCity);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
			new Object[] { mmCity.getRegionId(), mmCity.getName() }, mmCity);

		mmCity.resetOriginalValues();
	}

	/**
	 * Caches the m m cities in the entity cache if it is enabled.
	 *
	 * @param mmCities the m m cities
	 */
	@Override
	public void cacheResult(List<MMCity> mmCities) {
		for (MMCity mmCity : mmCities) {
			if (EntityCacheUtil.getResult(
						MMCityModelImpl.ENTITY_CACHE_ENABLED, MMCityImpl.class,
						mmCity.getPrimaryKey()) == null) {
				cacheResult(mmCity);
			}
			else {
				mmCity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all m m cities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MMCityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MMCityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the m m city.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MMCity mmCity) {
		EntityCacheUtil.removeResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityImpl.class, mmCity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(mmCity);
	}

	@Override
	public void clearCache(List<MMCity> mmCities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MMCity mmCity : mmCities) {
			EntityCacheUtil.removeResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
				MMCityImpl.class, mmCity.getPrimaryKey());

			clearUniqueFindersCache(mmCity);
		}
	}

	protected void cacheUniqueFindersCache(MMCity mmCity) {
		if (mmCity.isNew()) {
			Object[] args = new Object[] { mmCity.getRegionId(), mmCity.getName() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGIONID_NAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGIONID_NAME, args,
				mmCity);
		}
		else {
			MMCityModelImpl mmCityModelImpl = (MMCityModelImpl)mmCity;

			if ((mmCityModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REGIONID_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mmCity.getRegionId(), mmCity.getName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGIONID_NAME,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
					args, mmCity);
			}
		}
	}

	protected void clearUniqueFindersCache(MMCity mmCity) {
		MMCityModelImpl mmCityModelImpl = (MMCityModelImpl)mmCity;

		Object[] args = new Object[] { mmCity.getRegionId(), mmCity.getName() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID_NAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGIONID_NAME, args);

		if ((mmCityModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGIONID_NAME.getColumnBitmask()) != 0) {
			args = new Object[] {
					mmCityModelImpl.getOriginalRegionId(),
					mmCityModelImpl.getOriginalName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID_NAME,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGIONID_NAME,
				args);
		}
	}

	/**
	 * Creates a new m m city with the primary key. Does not add the m m city to the database.
	 *
	 * @param cityId the primary key for the new m m city
	 * @return the new m m city
	 */
	@Override
	public MMCity create(long cityId) {
		MMCity mmCity = new MMCityImpl();

		mmCity.setNew(true);
		mmCity.setPrimaryKey(cityId);

		return mmCity;
	}

	/**
	 * Removes the m m city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cityId the primary key of the m m city
	 * @return the m m city that was removed
	 * @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity remove(long cityId)
		throws NoSuchMMCityException, SystemException {
		return remove((Serializable)cityId);
	}

	/**
	 * Removes the m m city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m m city
	 * @return the m m city that was removed
	 * @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity remove(Serializable primaryKey)
		throws NoSuchMMCityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MMCity mmCity = (MMCity)session.get(MMCityImpl.class, primaryKey);

			if (mmCity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMMCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mmCity);
		}
		catch (NoSuchMMCityException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MMCity removeImpl(MMCity mmCity) throws SystemException {
		mmCity = toUnwrappedModel(mmCity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mmCity)) {
				mmCity = (MMCity)session.get(MMCityImpl.class,
						mmCity.getPrimaryKeyObj());
			}

			if (mmCity != null) {
				session.delete(mmCity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mmCity != null) {
			clearCache(mmCity);
		}

		return mmCity;
	}

	@Override
	public MMCity updateImpl(com.inikah.slayer.model.MMCity mmCity)
		throws SystemException {
		mmCity = toUnwrappedModel(mmCity);

		boolean isNew = mmCity.isNew();

		MMCityModelImpl mmCityModelImpl = (MMCityModelImpl)mmCity;

		Session session = null;

		try {
			session = openSession();

			if (mmCity.isNew()) {
				session.save(mmCity);

				mmCity.setNew(false);
			}
			else {
				session.merge(mmCity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MMCityModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((mmCityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mmCityModelImpl.getOriginalRegionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID,
					args);

				args = new Object[] { mmCityModelImpl.getRegionId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
			MMCityImpl.class, mmCity.getPrimaryKey(), mmCity);

		clearUniqueFindersCache(mmCity);
		cacheUniqueFindersCache(mmCity);

		return mmCity;
	}

	protected MMCity toUnwrappedModel(MMCity mmCity) {
		if (mmCity instanceof MMCityImpl) {
			return mmCity;
		}

		MMCityImpl mmCityImpl = new MMCityImpl();

		mmCityImpl.setNew(mmCity.isNew());
		mmCityImpl.setPrimaryKey(mmCity.getPrimaryKey());

		mmCityImpl.setCityId(mmCity.getCityId());
		mmCityImpl.setRegionId(mmCity.getRegionId());
		mmCityImpl.setName(mmCity.getName());

		return mmCityImpl;
	}

	/**
	 * Returns the m m city with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m m city
	 * @return the m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMMCityException, SystemException {
		MMCity mmCity = fetchByPrimaryKey(primaryKey);

		if (mmCity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMMCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mmCity;
	}

	/**
	 * Returns the m m city with the primary key or throws a {@link com.inikah.slayer.NoSuchMMCityException} if it could not be found.
	 *
	 * @param cityId the primary key of the m m city
	 * @return the m m city
	 * @throws com.inikah.slayer.NoSuchMMCityException if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity findByPrimaryKey(long cityId)
		throws NoSuchMMCityException, SystemException {
		return findByPrimaryKey((Serializable)cityId);
	}

	/**
	 * Returns the m m city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m m city
	 * @return the m m city, or <code>null</code> if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MMCity mmCity = (MMCity)EntityCacheUtil.getResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
				MMCityImpl.class, primaryKey);

		if (mmCity == _nullMMCity) {
			return null;
		}

		if (mmCity == null) {
			Session session = null;

			try {
				session = openSession();

				mmCity = (MMCity)session.get(MMCityImpl.class, primaryKey);

				if (mmCity != null) {
					cacheResult(mmCity);
				}
				else {
					EntityCacheUtil.putResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
						MMCityImpl.class, primaryKey, _nullMMCity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MMCityModelImpl.ENTITY_CACHE_ENABLED,
					MMCityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mmCity;
	}

	/**
	 * Returns the m m city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cityId the primary key of the m m city
	 * @return the m m city, or <code>null</code> if a m m city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMCity fetchByPrimaryKey(long cityId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cityId);
	}

	/**
	 * Returns all the m m cities.
	 *
	 * @return the m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the m m cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m m cities
	 * @param end the upper bound of the range of m m cities (not inclusive)
	 * @return the range of m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the m m cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m m cities
	 * @param end the upper bound of the range of m m cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMCity> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MMCity> list = (List<MMCity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MMCITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MMCITY;

				if (pagination) {
					sql = sql.concat(MMCityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MMCity>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MMCity>(list);
				}
				else {
					list = (List<MMCity>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the m m cities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MMCity mmCity : findAll()) {
			remove(mmCity);
		}
	}

	/**
	 * Returns the number of m m cities.
	 *
	 * @return the number of m m cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MMCITY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the m m city persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.inikah.slayer.model.MMCity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MMCity>> listenersList = new ArrayList<ModelListener<MMCity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MMCity>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MMCityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MMCITY = "SELECT mmCity FROM MMCity mmCity";
	private static final String _SQL_SELECT_MMCITY_WHERE = "SELECT mmCity FROM MMCity mmCity WHERE ";
	private static final String _SQL_COUNT_MMCITY = "SELECT COUNT(mmCity) FROM MMCity mmCity";
	private static final String _SQL_COUNT_MMCITY_WHERE = "SELECT COUNT(mmCity) FROM MMCity mmCity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mmCity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MMCity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MMCity exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MMCityPersistenceImpl.class);
	private static MMCity _nullMMCity = new MMCityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MMCity> toCacheModel() {
				return _nullMMCityCacheModel;
			}
		};

	private static CacheModel<MMCity> _nullMMCityCacheModel = new CacheModel<MMCity>() {
			@Override
			public MMCity toEntityModel() {
				return _nullMMCity;
			}
		};
}