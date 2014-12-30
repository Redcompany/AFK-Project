import java.util.List;
import java.util.Scanner;

import com.AFK.travel56.dao.MemberVO;
import com.AFK.travel56.dao.MySqlMemberDAO;

public class TestMember {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean loop = false;

		while (!loop) {
			MySqlMemberDAO mmdao = null;
			List<MemberVO> listVO = null;

			System.out.println("테스트 입니다!\n");
			System.out.println("1. 전체 회원보기");
			System.out.println("2. 아이디로 회원 검색하기");
			System.out.println("3. 회원가입");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("0. 종료!");
			System.out.print("입력 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				mmdao = new MySqlMemberDAO();
				System.out.println("1. 전체 회원 보기!");
				listVO = mmdao.findAllMembers();
				for (MemberVO list : listVO) {
					System.out.println(list);
				}
				break;

			case 2:
				mmdao = new MySqlMemberDAO();
				System.out.println("2. 아이디로 회원 검색");
				System.out.print("회원아이디를 입력하세요 : ");
				String memberIDCheck = sc.next();
				System.out.println(memberIDCheck);
				MemberVO mvo = mmdao.findMemberByID(memberIDCheck);
				System.out.println(mvo.getMemberID());
				break;

			case 3:
				mmdao = new MySqlMemberDAO();
				System.out.println("3. 회원가입");
				int addTest = mmdao.addMember("qwer", "1234", false,
						"abc@asd.asd", "jw", "19891118", "test");
				System.out.println(addTest + " row(s) affected");
				break;

			case 4:
				mmdao = new MySqlMemberDAO();
				System.out.println("4. 회원수정");
				int updateTest = mmdao.updateMember("qwer", "2345", true,
						"123@qew.com", "haha", "19900101", "010123123", "NickName");
				System.out.println(updateTest + "row(s) update");
				break;

			case 5:
				mmdao = new MySqlMemberDAO();
				System.out.println("5. 회원삭제");
				int delTest = mmdao.deleteMember("qwer", "1234");
				System.out.println(delTest + " row(s) delete");
				break;

			case 0:
				System.out.println("종료합니다.");
				loop = true;
				break;

			default:
				System.out.println("잘못입력했어요!");
			}
		}
		sc.close();
	}
}
