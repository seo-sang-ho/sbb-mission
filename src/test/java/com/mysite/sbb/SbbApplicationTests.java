package com.mysite.sbb;

import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuestionService questionService;

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

//	@Test
//	void findAll(){
//		List<Question> all = this.questionRepository.findAll();
//		assertThat(all.size()).isEqualTo(2);
//
//		Question q = all.get(0);
//		assertThat(q.getSubject()).isEqualTo("sbb가 무엇인가요?");
//	}
//
//	@Test
//	void findById(){
//		Optional<Question> question = this.questionRepository.findById(1);
//		if(question.isPresent()){
//			Question q = question.get();
//			assertThat(q.getContent()).isEqualTo("sbb에 대해서 알고 싶습니다.");
//		}
//	}
//
//	@Test
//	void findBySubject(){
//		Question question = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1,question.getId());
//	}
//
//	@Test
//	void findBySubjectAndContent() {
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());
//
//	}
//	@Test
//	void findBySubjectLike(){
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?",q.getSubject());
//	}
//	@Test
//	void modifyQuestion(){
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
//	}
//	@Test
//	void deleteQuestion(){
//		assertEquals(2,this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1,this.questionRepository.count());
//
//	}

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content,null);
		}
	}
}
