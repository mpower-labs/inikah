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

import com.inikah.slayer.NoSuchBridgeException;
import com.inikah.slayer.model.Bridge;
import com.inikah.slayer.model.impl.BridgeImpl;
import com.inikah.slayer.model.impl.BridgeModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the bridge service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see BridgePersistence
 * @see BridgeUtil
 * @generated
 */
public class BridgePersistenceImpl extends BasePersistenceImpl<Bridge>
	implements BridgePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BridgeUtil} to access the bridge persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BridgeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeModelImpl.FINDER_CACHE_ENABLED, BridgeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeModelImpl.FINDER_CACHE_ENABLED, BridgeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BridgePersistenceImpl() {
		setModelClass(Bridge.class);
	}

	/**
	 * Caches the bridge in the entity cache if it is enabled.
	 *
	 * @param bridge the bridge
	 */
	@Override
	public void cacheResult(Bridge bridge) {
		EntityCacheUtil.putResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeImpl.class, bridge.getPrimaryKey(), bridge);

		bridge.resetOriginalValues();
	}

	/**
	 * Caches the bridges in the entity cache if it is enabled.
	 *
	 * @param bridges the bridges
	 */
	@Override
	public void cacheResult(List<Bridge> bridges) {
		for (Bridge bridge : bridges) {
			if (EntityCacheUtil.getResult(
						BridgeModelImpl.ENTITY_CACHE_ENABLED, BridgeImpl.class,
						bridge.getPrimaryKey()) == null) {
				cacheResult(bridge);
			}
			else {
				bridge.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bridges.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BridgeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BridgeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bridge.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bridge bridge) {
		EntityCacheUtil.removeResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeImpl.class, bridge.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Bridge> bridges) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bridge bridge : bridges) {
			EntityCacheUtil.removeResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
				BridgeImpl.class, bridge.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bridge with the primary key. Does not add the bridge to the database.
	 *
	 * @param recId the primary key for the new bridge
	 * @return the new bridge
	 */
	@Override
	public Bridge create(long recId) {
		Bridge bridge = new BridgeImpl();

		bridge.setNew(true);
		bridge.setPrimaryKey(recId);

		return bridge;
	}

	/**
	 * Removes the bridge with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recId the primary key of the bridge
	 * @return the bridge that was removed
	 * @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge remove(long recId)
		throws NoSuchBridgeException, SystemException {
		return remove((Serializable)recId);
	}

	/**
	 * Removes the bridge with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bridge
	 * @return the bridge that was removed
	 * @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge remove(Serializable primaryKey)
		throws NoSuchBridgeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Bridge bridge = (Bridge)session.get(BridgeImpl.class, primaryKey);

			if (bridge == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBridgeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bridge);
		}
		catch (NoSuchBridgeException nsee) {
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
	protected Bridge removeImpl(Bridge bridge) throws SystemException {
		bridge = toUnwrappedModel(bridge);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bridge)) {
				bridge = (Bridge)session.get(BridgeImpl.class,
						bridge.getPrimaryKeyObj());
			}

			if (bridge != null) {
				session.delete(bridge);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bridge != null) {
			clearCache(bridge);
		}

		return bridge;
	}

	@Override
	public Bridge updateImpl(com.inikah.slayer.model.Bridge bridge)
		throws SystemException {
		bridge = toUnwrappedModel(bridge);

		boolean isNew = bridge.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bridge.isNew()) {
				session.save(bridge);

				bridge.setNew(false);
			}
			else {
				session.merge(bridge);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
			BridgeImpl.class, bridge.getPrimaryKey(), bridge);

		return bridge;
	}

	protected Bridge toUnwrappedModel(Bridge bridge) {
		if (bridge instanceof BridgeImpl) {
			return bridge;
		}

		BridgeImpl bridgeImpl = new BridgeImpl();

		bridgeImpl.setNew(bridge.isNew());
		bridgeImpl.setPrimaryKey(bridge.getPrimaryKey());

		bridgeImpl.setRecId(bridge.getRecId());

		return bridgeImpl;
	}

	/**
	 * Returns the bridge with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bridge
	 * @return the bridge
	 * @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBridgeException, SystemException {
		Bridge bridge = fetchByPrimaryKey(primaryKey);

		if (bridge == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBridgeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bridge;
	}

	/**
	 * Returns the bridge with the primary key or throws a {@link com.inikah.slayer.NoSuchBridgeException} if it could not be found.
	 *
	 * @param recId the primary key of the bridge
	 * @return the bridge
	 * @throws com.inikah.slayer.NoSuchBridgeException if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge findByPrimaryKey(long recId)
		throws NoSuchBridgeException, SystemException {
		return findByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns the bridge with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bridge
	 * @return the bridge, or <code>null</code> if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Bridge bridge = (Bridge)EntityCacheUtil.getResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
				BridgeImpl.class, primaryKey);

		if (bridge == _nullBridge) {
			return null;
		}

		if (bridge == null) {
			Session session = null;

			try {
				session = openSession();

				bridge = (Bridge)session.get(BridgeImpl.class, primaryKey);

				if (bridge != null) {
					cacheResult(bridge);
				}
				else {
					EntityCacheUtil.putResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
						BridgeImpl.class, primaryKey, _nullBridge);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BridgeModelImpl.ENTITY_CACHE_ENABLED,
					BridgeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bridge;
	}

	/**
	 * Returns the bridge with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recId the primary key of the bridge
	 * @return the bridge, or <code>null</code> if a bridge with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bridge fetchByPrimaryKey(long recId) throws SystemException {
		return fetchByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns all the bridges.
	 *
	 * @return the bridges
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bridge> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bridges.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.BridgeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bridges
	 * @param end the upper bound of the range of bridges (not inclusive)
	 * @return the range of bridges
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bridge> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bridges.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.inikah.slayer.model.impl.BridgeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bridges
	 * @param end the upper bound of the range of bridges (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bridges
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bridge> findAll(int start, int end,
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

		List<Bridge> list = (List<Bridge>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BRIDGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BRIDGE;

				if (pagination) {
					sql = sql.concat(BridgeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bridge>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Bridge>(list);
				}
				else {
					list = (List<Bridge>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the bridges from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Bridge bridge : findAll()) {
			remove(bridge);
		}
	}

	/**
	 * Returns the number of bridges.
	 *
	 * @return the number of bridges
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

				Query q = session.createQuery(_SQL_COUNT_BRIDGE);

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
	 * Initializes the bridge persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.inikah.slayer.model.Bridge")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Bridge>> listenersList = new ArrayList<ModelListener<Bridge>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Bridge>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BridgeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BRIDGE = "SELECT bridge FROM Bridge bridge";
	private static final String _SQL_COUNT_BRIDGE = "SELECT COUNT(bridge) FROM Bridge bridge";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bridge.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bridge exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BridgePersistenceImpl.class);
	private static Bridge _nullBridge = new BridgeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Bridge> toCacheModel() {
				return _nullBridgeCacheModel;
			}
		};

	private static CacheModel<Bridge> _nullBridgeCacheModel = new CacheModel<Bridge>() {
			@Override
			public Bridge toEntityModel() {
				return _nullBridge;
			}
		};
}