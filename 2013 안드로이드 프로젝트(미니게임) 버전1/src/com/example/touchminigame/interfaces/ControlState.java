package com.example.touchminigame.interfaces;

public interface ControlState {

	boolean TEST_STATE = false;
	
	int S_MAIN = 1000, //메인 인터페이스 화면
			S_GAME = 2000,  // 게임중
			S_SCENE = 3000; //대사 장면
	
	int MAX_STAGE = 5; //스테이지 갯수 조절 할것.
}
