package com.eyes.solstory.domain.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyes.solstory.domain.user.entity.User;
import com.eyes.solstory.domain.user.repository.UserRepository;

@Service
public class UserInfoService {
	@Autowired
    private UserRepository userRepository;
    
    public int updateUserInfo(User user) {
    	int userNo = user.getUserNo();
    	String mbti = user.getMbti();
    	String imgPath = user.getCharacterImgPath();
    	
    	if(mbti == null && imgPath != null) {
    		return userRepository.updateUserByCharacter(imgPath, userNo);
    	}
    	
    	if(mbti != null && imgPath == null) {
    		return userRepository.updateUserByCharacter(imgPath, userNo);
    	}
    	
    	if(mbti != null && imgPath != null) {
    		return userRepository.updateUserByMbti(imgPath, userNo);
    	}
    	
    	return 0;
    }
}
