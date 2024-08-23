package com.eyes.solstory.domain.challenge;

import com.eyes.solstory.domain.challenge.entity.Challenge;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ChallengeDataInitializer implements ApplicationRunner {

    private List<Challenge> challenges = new ArrayList<>();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initializeChallengeData();
    }

    private void initializeChallengeData() {
        // 저축 챌린지 데이터
        challenges.add(new Challenge(1, "", 30, "이번 달 5만원 더 저축하기", 3));
        challenges.add(new Challenge(1, "", 7, "이번 주 3만원 더 저축하기", 5));
        challenges.add(new Challenge(1, "", 30, "이번 달 7만원 더 저축하기", 4));
        challenges.add(new Challenge(1, "", 30, "이번 달 10만원 더 저축하기", 6));
        challenges.add(new Challenge(1, "", 30, "이번 달 50만원 더 저축하기", 10));

        // 절약 챌린지 데이터
        challenges.add(new Challenge(2, "식비", 7, "일주일 동안 전주 대비 식비 3만원 줄이기", 4));
        challenges.add(new Challenge(2, "식비", 30, "한 달 동안 전달 대비 식비 7만원 줄이기", 6));
        challenges.add(new Challenge(2, "배달음식", 7, "일주일 동안 배달 음식 먹지 않기", 4));
        challenges.add(new Challenge(2, "배달음식", 30, "한 달 동안 배달 음식 횟수 2회로 줄이기", 4));
        challenges.add(new Challenge(2, "배달음식", 30, "한 달 동안 배달 음식 없이 생활하기", 8));
        challenges.add(new Challenge(2, "음료", 7, "일주일 동안 커피숍 방문 2회 이하로 줄이기", 4));
        challenges.add(new Challenge(2, "음료", 7, "일주일 동안 커피숍 대신 집에서 커피 만들어 마시기 (커피값 0원)", 8));
        challenges.add(new Challenge(2, "교통비", 30, "한 달 동안 전달 대비 주유비 5만원 줄이기", 4));
        challenges.add(new Challenge(2, "교통비", 7, "일주일 동안 주 3회 이상 대중교통 이용하기", 4));
        challenges.add(new Challenge(2, "구독서비스", 30, "사용하지 않는 구독 서비스 1개 취소하기", 6));
        challenges.add(new Challenge(2, "쇼핑", 30, "한 달 동안 전달 대비 온라인 쇼핑 지출 5만원 줄이기", 4));
        challenges.add(new Challenge(2, "생활비", 30, "한 달 동안 전달 대비 전기 요금 3만원 줄이기", 6));
        challenges.add(new Challenge(2, "생활비", 30, "한 달 동안 전달 대비 수도 요금 2만원 줄이기", 4));
        challenges.add(new Challenge(2, "물건정리", 30, "한 달 동안 사용하지 않는 물건 2개 중고 마켓으로 판매하기", 6));
        challenges.add(new Challenge(2, "카드", 30, "전달 대비 카드 값 10만원 줄이기", 7));
        challenges.add(new Challenge(2, "카드", 30, "전달 대비 카드 값 3만원 줄이기", 3));
        challenges.add(new Challenge(2, "무지출", 1, "하루 만원으로 생활하기", 15));
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }
}
