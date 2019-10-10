package com.chanpion.boot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2019/9/29 14:58
 */
@Service
public class UserService {

    @Resource
    private TransactionTemplate transactionTemplate;

    public void add() {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {

                try {
                    return null;
                } catch (Exception e) {
                    status.setRollbackOnly();
                }
                return null;
            }
        });
    }
}
