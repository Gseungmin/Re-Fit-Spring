package com.umc.refit;

import com.umc.refit.domain.entity.Question;
import com.umc.refit.web.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class RefitApplication {

	private final QuestionRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RefitApplication.class, args);
	}

	@PostConstruct
	private void init() {
		repository.save(new Question(1, "영수증 종이는 재활용으로 버려야 할까요?", false, "영수증은 종이가 아닌 감열지를 사용하는데," +
				"감열지에는 염료와 유기산 등 약품 처리가" +
				"되어있어 재활용이 되지 않아요!" +
				"*출처 : 그린포스트코리아 Q&A 환경상식"));

		repository.save(new Question(1, "이거 제발 되야한다.", false, "영수증은 종이가 아닌 감열지를 사용하는데," +
				"감열지에는 염료와 유기산 등 약품 처리가" +
				"되어있어 재활용이 되지 않아요!" +
				"*출처 : 그린포스트코리아 Q&A 환경상식"));

		repository.save(new Question(1, "안되면 문제있는거야", false, "영수증은 종이가 아닌 감열지를 사용하는데," +
				"감열지에는 염료와 유기산 등 약품 처리가" +
				"되어있어 재활용이 되지 않아요!" +
				"*출처 : 그린포스트코리아 Q&A 환경상식"));

		repository.save(new Question(1, "병뚜껑은 닫아서 버려야 할까요?", true, "병뚜껑은 닫아서 버려야 할까요?소주병, 맥주병 등 재사용되는 공병은 오염 예방 및 깨짐 방지를 위해 뚜껑을 닫아서 배출되는 것이 권장되며, 투병 페트병은 빈 병을 압착해 부피를 줄여 뚜껑을 닫아서 내놓으면 돼요!"));

		repository.save(new Question(2, "수소법은 한국이 세계 최초로 지정한 법일까요?", true, "수소법은 수소경제(화석연료가 고갈되어 새롭게 등장할 수소가 주 연료가 되는 미래 경제)육성 및 안전관리에 관한 법으로, 2020년 2월 세계 최초로 제정되었어요! 수소는 열량이 내연기관 연료의 약 3배이며 수소를 연료로 하는 수소차는 자동차의 매연, 배기가스와 같은 대기오염 문제를 줄여주는 장점을 가지고 있어요."));

		repository.save(new Question(2, "종이컵, 플라스틱 컵보다 텀블러를 사용하는 것이 무조건 좋을까요?", false, "플라스틱 컵은 자연적으로 분해되는데 500년 이상이 걸리고, 종이컵은 재활용률이 매우 낮아 이 대신 텀블러를 사용하는 분들이 많아졌어요. 다만 환경 보호의 상징처럼 된 텀블러는 오히려 생산과 폐기 과정에서 종이컵, 플라스틱 컵보다 더욱 많은 온실가스를 유발해 여러 개를 사용할 경우 오히려 환경보호에 도움이 되지 않아요! 환경 보호를 위해서는 하나의 텀블러를 구매해 오래 사용하는 것이 더욱 좋아요 :)"));
	}
}