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

import com.inikah.slayer.NoSuchMMRegionException;
import com.inikah.slayer.model.MMRegion;
import com.inikah.slayer.model.impl.MMRegionImpl;
import com.inikah.slayer.model.impl.MMRegionModelImpl;

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
 * The persistence implementation for the m m region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMRegionPersistence
 * @see MMRegionUtil
 * @generated
 */
public class MMRegionPersistenceImpl extends BasePersistenceImpl<MMRegion>
	implements MMRegionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MMRegionUtil} to access the m m region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MMRegionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, MMRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, MMRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, MMRegionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCountryId_isoCode",
			new String[] { Long.class.getName(), String.class.getName() },
			MMRegionModelImpl.COUNTRYID_COLUMN_BITMASK |
			MMRegionModelImpl.ISOCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCountryId_isoCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the m m region where countryId = &#63; and isoCode = &#63; or throws a {@link com.inikah.slayer.NoSuchMMRegionException} if it could not be found.
	 *
	 * @param countryId the country ID
	 * @param isoCode the iso code
	 * @return the matching m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion findByCountryId_isoCode(long countryId, String isoCode)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = fetchByCountryId_isoCode(countryId, isoCode);

		if (mmRegion == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("countryId=");
			msg.append(countryId);

			msg.append(", isoCode=");
			msg.append(isoCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMMRegionException(msg.toString());
		}

		return mmRegion;
	}

	/**
	 * Returns the m m region where countryId = &#63; and isoCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param countryId the country ID
	 * @param isoCode the iso code
	 * @return the matching m m region, or <code>null</code> if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByCountryId_isoCode(long countryId, String isoCode)
		throws SystemException {
		return fetchByCountryId_isoCode(countryId, isoCode, true);
	}

	/**
	 * Returns the m m region where countryId = &#63; and isoCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param countryId the country ID
	 * @param isoCode the iso code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching m m region, or <code>null</code> if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByCountryId_isoCode(long countryId, String isoCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { countryId, isoCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
					finderArgs, this);
		}

		if (result instanceof MMRegion) {
			MMRegion mmRegion = (MMRegion)result;

			if ((countryId != mmRegion.getCountryId()) ||
					!Validator.equals(isoCode, mmRegion.getIsoCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MMREGION_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_COUNTRYID_2);

			boolean bindIsoCode = false;

			if (isoCode == null) {
				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_1);
			}
			else if (isoCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_3);
			}
			else {
				bindIsoCode = true;

				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryId);

				if (bindIsoCode) {
					qPos.add(isoCode);
				}

				List<MMRegion> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MMRegionPersistenceImpl.fetchByCountryId_isoCode(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MMRegion mmRegion = list.get(0);

					result = mmRegion;

					cacheResult(mmRegion);

					if ((mmRegion.getCountryId() != countryId) ||
							(mmRegion.getIsoCode() == null) ||
							!mmRegion.getIsoCode().equals(isoCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
							finderArgs, mmRegion);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
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
			return (MMRegion)result;
		}
	}

	/**
	 * Removes the m m region where countryId = &#63; and isoCode = &#63; from the database.
	 *
	 * @param countryId the country ID
	 * @param isoCode the iso code
	 * @return the m m region that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion removeByCountryId_isoCode(long countryId, String isoCode)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = findByCountryId_isoCode(countryId, isoCode);

		return remove(mmRegion);
	}

	/**
	 * Returns the number of m m regions where countryId = &#63; and isoCode = &#63;.
	 *
	 * @param countryId the country ID
	 * @param isoCode the iso code
	 * @return the number of matching m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCountryId_isoCode(long countryId, String isoCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE;

		Object[] finderArgs = new Object[] { countryId, isoCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MMREGION_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_COUNTRYID_2);

			boolean bindIsoCode = false;

			if (isoCode == null) {
				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_1);
			}
			else if (isoCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_3);
			}
			else {
				bindIsoCode = true;

				query.append(_FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryId);

				if (bindIsoCode) {
					qPos.add(isoCode);
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

	private static final String _FINDER_COLUMN_COUNTRYID_ISOCODE_COUNTRYID_2 = "mmRegion.countryId = ? AND ";
	private static final String _FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_1 = "mmRegion.isoCode IS NULL";
	private static final String _FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_2 = "mmRegion.isoCode = ?";
	private static final String _FINDER_COLUMN_COUNTRYID_ISOCODE_ISOCODE_3 = "(mmRegion.isoCode IS NULL OR mmRegion.isoCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRYID =
		new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, MMRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCountryId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID =
		new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, MMRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCountryId",
			new String[] { Long.class.getName() },
			MMRegionModelImpl.COUNTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COUNTRYID = new FinderPath(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCountryId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the m m regions where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @return the matching m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findByCountryId(long countryId)
		throws SystemException {
		return findByCountryId(countryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the m m regions where countryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param countryId the country ID
	 * @param start the lower bound of the range of m m regions
	 * @param end the upper bound of the range of m m regions (not inclusive)
	 * @return the range of matching m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findByCountryId(long countryId, int start, int end)
		throws SystemException {
		return findByCountryId(countryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the m m regions where countryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param countryId the country ID
	 * @param start the lower bound of the range of m m regions
	 * @param end the upper bound of the range of m m regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findByCountryId(long countryId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID;
			finderArgs = new Object[] { countryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRYID;
			finderArgs = new Object[] { countryId, start, end, orderByComparator };
		}

		List<MMRegion> list = (List<MMRegion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MMRegion mmRegion : list) {
				if ((countryId != mmRegion.getCountryId())) {
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

			query.append(_SQL_SELECT_MMREGION_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MMRegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryId);

				if (!pagination) {
					list = (List<MMRegion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MMRegion>(list);
				}
				else {
					list = (List<MMRegion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first m m region in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion findByCountryId_First(long countryId,
		OrderByComparator orderByComparator)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = fetchByCountryId_First(countryId, orderByComparator);

		if (mmRegion != null) {
			return mmRegion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryId=");
		msg.append(countryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMMRegionException(msg.toString());
	}

	/**
	 * Returns the first m m region in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m m region, or <code>null</code> if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByCountryId_First(long countryId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MMRegion> list = findByCountryId(countryId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last m m region in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion findByCountryId_Last(long countryId,
		OrderByComparator orderByComparator)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = fetchByCountryId_Last(countryId, orderByComparator);

		if (mmRegion != null) {
			return mmRegion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryId=");
		msg.append(countryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMMRegionException(msg.toString());
	}

	/**
	 * Returns the last m m region in the ordered set where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m m region, or <code>null</code> if a matching m m region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByCountryId_Last(long countryId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCountryId(countryId);

		if (count == 0) {
			return null;
		}

		List<MMRegion> list = findByCountryId(countryId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the m m regions before and after the current m m region in the ordered set where countryId = &#63;.
	 *
	 * @param regionId the primary key of the current m m region
	 * @param countryId the country ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion[] findByCountryId_PrevAndNext(long regionId,
		long countryId, OrderByComparator orderByComparator)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = findByPrimaryKey(regionId);

		Session session = null;

		try {
			session = openSession();

			MMRegion[] array = new MMRegionImpl[3];

			array[0] = getByCountryId_PrevAndNext(session, mmRegion, countryId,
					orderByComparator, true);

			array[1] = mmRegion;

			array[2] = getByCountryId_PrevAndNext(session, mmRegion, countryId,
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

	protected MMRegion getByCountryId_PrevAndNext(Session session,
		MMRegion mmRegion, long countryId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MMREGION_WHERE);

		query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

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
			query.append(MMRegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(countryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mmRegion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MMRegion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the m m regions where countryId = &#63; from the database.
	 *
	 * @param countryId the country ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCountryId(long countryId) throws SystemException {
		for (MMRegion mmRegion : findByCountryId(countryId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(mmRegion);
		}
	}

	/**
	 * Returns the number of m m regions where countryId = &#63;.
	 *
	 * @param countryId the country ID
	 * @return the number of matching m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCountryId(long countryId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COUNTRYID;

		Object[] finderArgs = new Object[] { countryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MMREGION_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryId);

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

	private static final String _FINDER_COLUMN_COUNTRYID_COUNTRYID_2 = "mmRegion.countryId = ?";

	public MMRegionPersistenceImpl() {
		setModelClass(MMRegion.class);
	}

	/**
	 * Caches the m m region in the entity cache if it is enabled.
	 *
	 * @param mmRegion the m m region
	 */
	@Override
	public void cacheResult(MMRegion mmRegion) {
		EntityCacheUtil.putResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionImpl.class, mmRegion.getPrimaryKey(), mmRegion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
			new Object[] { mmRegion.getCountryId(), mmRegion.getIsoCode() },
			mmRegion);

		mmRegion.resetOriginalValues();
	}

	/**
	 * Caches the m m regions in the entity cache if it is enabled.
	 *
	 * @param mmRegions the m m regions
	 */
	@Override
	public void cacheResult(List<MMRegion> mmRegions) {
		for (MMRegion mmRegion : mmRegions) {
			if (EntityCacheUtil.getResult(
						MMRegionModelImpl.ENTITY_CACHE_ENABLED,
						MMRegionImpl.class, mmRegion.getPrimaryKey()) == null) {
				cacheResult(mmRegion);
			}
			else {
				mmRegion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all m m regions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MMRegionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MMRegionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the m m region.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MMRegion mmRegion) {
		EntityCacheUtil.removeResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionImpl.class, mmRegion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(mmRegion);
	}

	@Override
	public void clearCache(List<MMRegion> mmRegions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MMRegion mmRegion : mmRegions) {
			EntityCacheUtil.removeResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
				MMRegionImpl.class, mmRegion.getPrimaryKey());

			clearUniqueFindersCache(mmRegion);
		}
	}

	protected void cacheUniqueFindersCache(MMRegion mmRegion) {
		if (mmRegion.isNew()) {
			Object[] args = new Object[] {
					mmRegion.getCountryId(), mmRegion.getIsoCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
				args, mmRegion);
		}
		else {
			MMRegionModelImpl mmRegionModelImpl = (MMRegionModelImpl)mmRegion;

			if ((mmRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mmRegion.getCountryId(), mmRegion.getIsoCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
					args, mmRegion);
			}
		}
	}

	protected void clearUniqueFindersCache(MMRegion mmRegion) {
		MMRegionModelImpl mmRegionModelImpl = (MMRegionModelImpl)mmRegion;

		Object[] args = new Object[] {
				mmRegion.getCountryId(), mmRegion.getIsoCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
			args);

		if ((mmRegionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					mmRegionModelImpl.getOriginalCountryId(),
					mmRegionModelImpl.getOriginalIsoCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID_ISOCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID_ISOCODE,
				args);
		}
	}

	/**
	 * Creates a new m m region with the primary key. Does not add the m m region to the database.
	 *
	 * @param regionId the primary key for the new m m region
	 * @return the new m m region
	 */
	@Override
	public MMRegion create(long regionId) {
		MMRegion mmRegion = new MMRegionImpl();

		mmRegion.setNew(true);
		mmRegion.setPrimaryKey(regionId);

		return mmRegion;
	}

	/**
	 * Removes the m m region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param regionId the primary key of the m m region
	 * @return the m m region that was removed
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion remove(long regionId)
		throws NoSuchMMRegionException, SystemException {
		return remove((Serializable)regionId);
	}

	/**
	 * Removes the m m region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m m region
	 * @return the m m region that was removed
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion remove(Serializable primaryKey)
		throws NoSuchMMRegionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MMRegion mmRegion = (MMRegion)session.get(MMRegionImpl.class,
					primaryKey);

			if (mmRegion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMMRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mmRegion);
		}
		catch (NoSuchMMRegionException nsee) {
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
	protected MMRegion removeImpl(MMRegion mmRegion) throws SystemException {
		mmRegion = toUnwrappedModel(mmRegion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mmRegion)) {
				mmRegion = (MMRegion)session.get(MMRegionImpl.class,
						mmRegion.getPrimaryKeyObj());
			}

			if (mmRegion != null) {
				session.delete(mmRegion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mmRegion != null) {
			clearCache(mmRegion);
		}

		return mmRegion;
	}

	@Override
	public MMRegion updateImpl(com.inikah.slayer.model.MMRegion mmRegion)
		throws SystemException {
		mmRegion = toUnwrappedModel(mmRegion);

		boolean isNew = mmRegion.isNew();

		MMRegionModelImpl mmRegionModelImpl = (MMRegionModelImpl)mmRegion;

		Session session = null;

		try {
			session = openSession();

			if (mmRegion.isNew()) {
				session.save(mmRegion);

				mmRegion.setNew(false);
			}
			else {
				session.merge(mmRegion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MMRegionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((mmRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mmRegionModelImpl.getOriginalCountryId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID,
					args);

				args = new Object[] { mmRegionModelImpl.getCountryId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID,
					args);
			}
		}

		EntityCacheUtil.putResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
			MMRegionImpl.class, mmRegion.getPrimaryKey(), mmRegion);

		clearUniqueFindersCache(mmRegion);
		cacheUniqueFindersCache(mmRegion);

		return mmRegion;
	}

	protected MMRegion toUnwrappedModel(MMRegion mmRegion) {
		if (mmRegion instanceof MMRegionImpl) {
			return mmRegion;
		}

		MMRegionImpl mmRegionImpl = new MMRegionImpl();

		mmRegionImpl.setNew(mmRegion.isNew());
		mmRegionImpl.setPrimaryKey(mmRegion.getPrimaryKey());

		mmRegionImpl.setRegionId(mmRegion.getRegionId());
		mmRegionImpl.setCountryId(mmRegion.getCountryId());
		mmRegionImpl.setIsoCode(mmRegion.getIsoCode());
		mmRegionImpl.setName(mmRegion.getName());

		return mmRegionImpl;
	}

	/**
	 * Returns the m m region with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m m region
	 * @return the m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMMRegionException, SystemException {
		MMRegion mmRegion = fetchByPrimaryKey(primaryKey);

		if (mmRegion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMMRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mmRegion;
	}

	/**
	 * Returns the m m region with the primary key or throws a {@link com.inikah.slayer.NoSuchMMRegionException} if it could not be found.
	 *
	 * @param regionId the primary key of the m m region
	 * @return the m m region
	 * @throws com.inikah.slayer.NoSuchMMRegionException if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion findByPrimaryKey(long regionId)
		throws NoSuchMMRegionException, SystemException {
		return findByPrimaryKey((Serializable)regionId);
	}

	/**
	 * Returns the m m region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m m region
	 * @return the m m region, or <code>null</code> if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MMRegion mmRegion = (MMRegion)EntityCacheUtil.getResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
				MMRegionImpl.class, primaryKey);

		if (mmRegion == _nullMMRegion) {
			return null;
		}

		if (mmRegion == null) {
			Session session = null;

			try {
				session = openSession();

				mmRegion = (MMRegion)session.get(MMRegionImpl.class, primaryKey);

				if (mmRegion != null) {
					cacheResult(mmRegion);
				}
				else {
					EntityCacheUtil.putResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
						MMRegionImpl.class, primaryKey, _nullMMRegion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MMRegionModelImpl.ENTITY_CACHE_ENABLED,
					MMRegionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mmRegion;
	}

	/**
	 * Returns the m m region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param regionId the primary key of the m m region
	 * @return the m m region, or <code>null</code> if a m m region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MMRegion fetchByPrimaryKey(long regionId) throws SystemException {
		return fetchByPrimaryKey((Serializable)regionId);
	}

	/**
	 * Returns all the m m regions.
	 *
	 * @return the m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the m m regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m m regions
	 * @param end the upper bound of the range of m m regions (not inclusive)
	 * @return the range of m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the m m regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.MMRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m m regions
	 * @param end the upper bound of the range of m m regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of m m regions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MMRegion> findAll(int start, int end,
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

		List<MMRegion> list = (List<MMRegion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MMREGION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MMREGION;

				if (pagination) {
					sql = sql.concat(MMRegionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MMRegion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MMRegion>(list);
				}
				else {
					list = (List<MMRegion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the m m regions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MMRegion mmRegion : findAll()) {
			remove(mmRegion);
		}
	}

	/**
	 * Returns the number of m m regions.
	 *
	 * @return the number of m m regions
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

				Query q = session.createQuery(_SQL_COUNT_MMREGION);

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
	 * Initializes the m m region persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.inikah.slayer.model.MMRegion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MMRegion>> listenersList = new ArrayList<ModelListener<MMRegion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MMRegion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MMRegionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MMREGION = "SELECT mmRegion FROM MMRegion mmRegion";
	private static final String _SQL_SELECT_MMREGION_WHERE = "SELECT mmRegion FROM MMRegion mmRegion WHERE ";
	private static final String _SQL_COUNT_MMREGION = "SELECT COUNT(mmRegion) FROM MMRegion mmRegion";
	private static final String _SQL_COUNT_MMREGION_WHERE = "SELECT COUNT(mmRegion) FROM MMRegion mmRegion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mmRegion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MMRegion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MMRegion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MMRegionPersistenceImpl.class);
	private static MMRegion _nullMMRegion = new MMRegionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MMRegion> toCacheModel() {
				return _nullMMRegionCacheModel;
			}
		};

	private static CacheModel<MMRegion> _nullMMRegionCacheModel = new CacheModel<MMRegion>() {
			@Override
			public MMRegion toEntityModel() {
				return _nullMMRegion;
			}
		};
}