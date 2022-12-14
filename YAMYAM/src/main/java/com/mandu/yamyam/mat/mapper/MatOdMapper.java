package com.mandu.yamyam.mat.mapper;

import java.util.List;
import java.util.Map;

import com.mandu.yamyam.mat.service.MatVO;

public interface MatOdMapper {
	//===============================================
	// 공통
	//===============================================
	// 돋보기 자재목록 모달
	public List<Map<String, Object>> matList();
	
	// 돋보기 업체목록 모달
	public List<Map<String, Object>> actList();
	
	//===============================================
	// 1) 자재 발주 관리
	//===============================================
	// 자재 발주 관리(일반 탭) - 기본 전체 조회
	public List<Map<String, Object>> matOderN7();
	
	// 자재 발주 관리(일반 탭)  - 조회 버튼 시 전체 조회
	public List<Map<String, Object>> matOrderList(MatVO vo);
	
	// 자재 발주 관리 - 발주상세코드 단건 delete(일반 탭)
	public int delMatOd(MatVO vo);
	
	// 자재 발주 관리 - 발주상세코드 여러건 delete(일반 탭)
	public int delMatOdList(MatVO vo);
	
	// 자재 발주 관리 - 발주상세코드 여러건 delete(일반 탭)
	public int delMatOddList(MatVO vo);
	
	// 자재 발주 관리 - 발주상세코드 insert(일반 탭)
	public int insMatOdList(MatVO vo);
	
	// 자재 발주 관리 - insert2(생산계획서용 탭)
	public int insertMatOdPplnCd(MatVO vo);
	
	// 신규생산계획조회(생산계획서용 탭)
	public List<Map<String, Object>> newPlanList();
	
	// 신규 생산 계획서 모델 선택 모달창(생산계획서용 탭)
	public List<Map<String, Object>> addNewPlan();
	
	// 자재발주 전체리스트(생산계획서용 탭)
	public List<Map<String, Object>> odMatList();
	
	// 자재발주 전체리스트(생산계획서용 탭)
	public List<Map<String, Object>> newPlanInfo(String pplnCd);
	
	// 필요자재조회(생산계획 탭)
	public List<Map<String, Object>> needMatList(String prdCd);
	
	// 신규 생산 계획서 리스트 조회버튼(자재 발주 - 생산계획 탭)
	public List<Map<String, Object>> newPlanLookUpBtn(MatVO vo);
	
	// 발주 리스트 날짜 조회버튼(일반 탭)
	public List<Map<String, Object>> odListDtLookUpBtn(MatVO vo);
	
	// 저장하면 자재팀확인 -> 미지시 업데이트
	public int updatePlndSts(MatVO vo);
	
	//===============================================
	// 2) 자재 발주 조회
	//===============================================
	// 자재 발주 전체 조회
	public List<Map<String, Object>> matOdLookUpList();
	
	// 발주 신청일 조회 버튼 클릭 이벤트 (자재 발주 조회 - 조건 조회 탭)
	public List<Map<String, Object>> odListSearch(MatVO vo);
	
	// 발주 신청일 클릭 시 이벤트 (조건 조회 탭)
	public List<Map<String, Object>> clickOdDate(MatVO vo);

	//===============================================
	// 3) 자재 입고 검수 관리
	//===============================================
	// 자재 발주 7일치 기본 조회
	public List<Map<String, Object>> chkOdList7();
	
	// 자재 입고 검수 관리 - 전체 조회
	public List<Map<String, Object>> chkOdMatList(MatVO vo);
	
	// 자재 입고 검수 관리 - 추가 모달창
	public List<Map<String, Object>> addChkModal();
	
	// 불량코드/불량내용 조회
	public List<Map<String, Object>> erCdErInfoLookUp();
	
	// 직원 목록 조회
	public List<Map<String, Object>> empLookUp();
	
	// 자재 입고 검수 관리 - insert
	public int insertChkOd(MatVO vo);
	
	// 자재 입고 검수 관리 - update
	public int updateMatOdSts(MatVO vo);
	
	// 자재 입고 검수 관리 - delete
	public int deletetChkOd(MatVO vo);
	
	//===============================================
	// 4) 자재 입고 관리
	//===============================================
	// 조회 버튼 클릭 시 조회
	public List<Map<String, Object>> matInAllList(MatVO vo);
	
	// 기본 조회
	public List<Map<String, Object>> matInList();
	
	// 입고 예정 목록
	public List<Map<String, Object>> beforeInList();
	
	// insert
	public int inManageSave(MatVO vo);
	
	// 생산계획 update
	public int updatePpSts(MatVO vo);
	
	// 검수상태 update
	public int updateMatInsts(MatVO vo);
	
	// delete
	public int inManageDelete(MatVO vo);
	
	//===============================================
	// 5) 자재 출고 관리
	//===============================================
	// 생산 지시 조회
	public List<Map<String, Object>> pOdAllList();
	
	// 필요자재
	public List<Map<String, Object>> needMtrList(MatVO vo);
	
	// 필요자재LOT목록
	public List<Map<String, Object>> needMtrLotList(MatVO vo);
	
	// 출고테이블로 insert
	public int insertMatOut(MatVO vo);
	
	// 출고처리 - 자재 마이너스 업데이트
	public int updateOutOd(MatVO vo);
	
	// 출고처리 - 상태 완료로 업데이트
	public int updateOutSts(MatVO vo);
	
	//===============================================
	// 6) 자재 입출고 조회
	//===============================================
	// 전체 리스트
	public List<Map<String, Object>> inOutAllList();
	
	// 입고 전체 리스트
	public List<Map<String, Object>> outInAllList();
	
	// 입고 조건 검색
	public List<Map<String, Object>> selectInOutAllList(MatVO vo);
	
	// 출고 조건조회
	public List<Map<String, Object>> selectOutInAllList(MatVO vo);
	
	//===============================================
	// 7) 자재 재고 조회
	//===============================================
	// 전체 조회
	public List<Map<String, Object>> matStockList();
	
	// 홀딩수량
	public List<Map<String, Object>> getHoldAmt();
	
	// 조건조회
	public List<Map<String, Object>> matStockSelectList(MatVO vo);
	
	//===============================================
	// 8) 자재 반품 관리
	//===============================================
	// 반품리스트
	public List<Map<String, Object>> returnMtrList();
	
	// 전체리스트 상세정보
	public List<Map<String, Object>> returnInfo(MatVO vo);
	
	// insert
	public int insertRtOd(MatVO vo);
	
	// update
	public int updateRtOd(MatVO vo);
	
	//===============================================
	// 9) 자재 반품 조회
	//===============================================
	// 전체리스트
	public List<Map<String, Object>> mtrReturnAllList();
	
	// 조건조회
	public List<Map<String, Object>> matReturnSearch(MatVO vo);
	
	//===============================================
	// 10) 안전 재고 관리
	//===============================================
	// 전체 조회
	public List<Map<String, Object>> selectSamt();
	
	// 안전 재고 관리
	public int mtrSfUpdate(MatVO vo);
}
