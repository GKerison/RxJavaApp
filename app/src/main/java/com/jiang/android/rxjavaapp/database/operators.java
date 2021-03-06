package com.jiang.android.rxjavaapp.database;

import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "OPERATORS".
 */
public class operators {

    private Long id;
    private String name;
    private Long outer_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient operatorsDao myDao;

    private alloperators alloperators;
    private Long alloperators__resolvedKey;


    public operators() {
    }

    public operators(Long id) {
        this.id = id;
    }

    public operators(Long id, String name, Long outer_id) {
        this.id = id;
        this.name = name;
        this.outer_id = outer_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getOperatorsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOuter_id() {
        return outer_id;
    }

    public void setOuter_id(Long outer_id) {
        this.outer_id = outer_id;
    }

    /** To-one relationship, resolved on first access. */
    public alloperators getAlloperators() {
        Long __key = this.outer_id;
        if (alloperators__resolvedKey == null || !alloperators__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            alloperatorsDao targetDao = daoSession.getAlloperatorsDao();
            alloperators alloperatorsNew = targetDao.load(__key);
            synchronized (this) {
                alloperators = alloperatorsNew;
            	alloperators__resolvedKey = __key;
            }
        }
        return alloperators;
    }

    public void setAlloperators(alloperators alloperators) {
        synchronized (this) {
            this.alloperators = alloperators;
            outer_id = alloperators == null ? null : alloperators.getId();
            alloperators__resolvedKey = outer_id;
        }
    }

    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
