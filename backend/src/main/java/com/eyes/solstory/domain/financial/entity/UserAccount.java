package com.eyes.solstory.domain.financial.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_accounts")
@SequenceGenerator(
	    name = "account_seq_generator",
	    sequenceName = "account_seq", // 오라클에 생성한 시퀀스 이름
	    allocationSize = 1  // 시퀀스 값을 하나씩 증가
	)
public class UserAccount {

    // 계좌번호
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq_generator")
    @Column(name = "account_no", nullable = false, length = 34)
    private String accountNo;

    // 사용자 일련번호
    @Column(name = "user_no", nullable = false)
    private int userNo;

    // 계좌 유형
    @Column(name = "account_type", precision = 1, nullable = false)
    private int accountType;

    // 계좌 이름
    @Column(name = "account_name", nullable = false, length = 100)
    private String accountName;

    // 저축 목표 금액
    @Column(name = "target_amount", precision = 15)
    private int targetAmount;

    // 시작 일자
    @Column(name = "reg_date", nullable = false)
    private LocalDate regDate;

    // 종료 일자
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    // 계좌 활성화 여부(0: 비활성화, 1:활성화)
    @Column(name = "is_active", nullable = false, precision = 1)
    private int isActive;

}