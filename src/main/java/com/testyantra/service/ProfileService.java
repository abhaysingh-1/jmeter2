/*
 * INSERT COPYRIGHT HERE
 */

package com.testyantra.service;

import com.testyantra.dao.DProfileDao;
import com.testyantra.dao.DProfileDaoBean;
import com.testyantra.domain.DProfile;
import com.wadpam.gaelic.oauth.service.OAuth2UserServiceImpl;

/**
 *
 * @author sosandstrom
 */
public class ProfileService extends OAuth2UserServiceImpl<DProfile, DProfileDao> {

    public ProfileService() {
        super(DProfile.class, DProfileDaoBean.class);
    }

}
