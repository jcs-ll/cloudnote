package com.oracle.hrb.cloudnote.dao;

import com.oracle.hrb.cloudnote.entity.NotebookType;

import java.util.List;

public abstract class NotebookTypeDao {
    abstract NotebookType findNormal();
    abstract List<NotebookType> findSpecial();
}
