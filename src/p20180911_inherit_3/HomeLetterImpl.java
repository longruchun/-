package p20180911_inherit_3;

public class HomeLetterImpl implements Homeletter {

	public void writeBody() {
		System.out.println("    ��������ͦ�õġ�\n" +
				"    �һ�Ŭ��ѧϰ�ģ��Ѿ�ѧ��Java OOP����\n"+
				"    �����ϱ������尡��\n");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeGreeting()
	 */
	public void writeGreeting() {
		System.out.println("    ����\n����");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeHello()
	 */
	public void writeHello() {
		System.out.println("    ���Ǻ���\n");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeSelf()
	 */
	public void writeSelf() {
		System.out.println("\t\t���� \n\t2018��9��12��");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeTitle()
	 */
	public void writeTitle() {
		System.out.println("�װ��İְ֡����裺");
	}
}
