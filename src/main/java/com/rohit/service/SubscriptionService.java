package com.rohit.service;

import com.rohit.domain.PlanType;
import com.rohit.model.Subscription;
import com.rohit.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
