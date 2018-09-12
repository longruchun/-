package p20180911_inherit_3;

public class HomeLetterImpl implements Homeletter {

	public void writeBody() {
		System.out.println("    我在这里挺好的。\n" +
				"    我会努力学习的，已经学到Java OOP啦！\n"+
				"    您二老保重身体啊！\n");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeGreeting()
	 */
	public void writeGreeting() {
		System.out.println("    此致\n敬礼");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeHello()
	 */
	public void writeHello() {
		System.out.println("    你们好吗？\n");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeSelf()
	 */
	public void writeSelf() {
		System.out.println("\t\t张三 \n\t2018年9月12日");
	}

	/* (non-Javadoc)
	 * @see cn.jbit.letter.HomeLetter#writeTitle()
	 */
	public void writeTitle() {
		System.out.println("亲爱的爸爸、妈妈：");
	}
}
