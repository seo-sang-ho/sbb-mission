package com.mysite.sbb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

//	@Test
//	void testJpa(){
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링은 무엇인가요?");
//		q2.setContent("스프링에 대해서 알고 싶습니다.");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//	}

	@Test
	void findAll(){
		List<Question> all = this.questionRepository.findAll();
		assertThat(all.size()).isEqualTo(2);

		Question q = all.get(0);
		assertThat(q.getSubject()).isEqualTo("sbb가 무엇인가요?");
	}

	@Test
	void findById(){
		Optional<Question> question = this.questionRepository.findById(1);
		if(question.isPresent()){
			Question q = question.get();
			assertThat(q.getContent()).isEqualTo("sbb에 대해서 알고 싶습니다.");
		}
	}

	@Test
	void findBySubject(){
		Question question = this.questionRepository.findBySubject("sbb는 무엇인가요?");
		org.junit.jupiter.api.Assertions.assertEquals(1,question.getId());
	}

	@Test
	void findBySubjectAndContent(){
		Question q = this.questionRepository.findBySubjectAndContent("sbb는 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		org.junit.jupiter.api.Assertions.assertEquals(1,q.getId());

	}
}
