package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * CRUD 의 기능을 모두 상속 받은 크리에이터 지원서 관련 인터페이스.
 * 
 * @author eney-pc3
 *
 */
public interface CreatorApplyDAO extends CreatorApplyCreateDAO, CreatorApplyDeleteDAO, CreatorApplyRetrieveDAO, CreatorApplyUpdateDAO{

}
