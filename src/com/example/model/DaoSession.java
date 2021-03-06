package com.example.model;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.model.UserBean;

import com.example.model.USERDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig uSERDaoConfig;

    private final USERDao uSERDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        uSERDaoConfig = daoConfigMap.get(USERDao.class).clone();
        uSERDaoConfig.initIdentityScope(type);

        uSERDao = new USERDao(uSERDaoConfig, this);

        registerDao(UserBean.class, uSERDao);
    }
    
    public void clear() {
        uSERDaoConfig.getIdentityScope().clear();
    }

    public USERDao getUSERDao() {
        return uSERDao;
    }

}
