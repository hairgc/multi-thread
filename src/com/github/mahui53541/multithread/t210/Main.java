package com.github.mahui53541.multithread.t210;

import java.util.Scanner;

public class Main {
	
	private static final int CUSTOMS_LIMIT_MONEY_PER_BOX=2000;
	/** 请完成下面这个process函数，实现题目要求的功能 **/
	/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
	private static int process() {
		return 0;

	}
	
	/**
	 * 
	 * @ClassName:  BoxTemplate   
	 * @Description:商品包装类
	 * @author: mahui 
	 * @date:   2017年8月25日 下午7:59:23   
	 */
	 private class BoxTemplate{
		private Integer length;
		private Integer width;
		private Integer height;
		private Integer price;
		public Integer getLength() {
			return length;
		}
		public void setLength(Integer length) {
			this.length = length;
		}
		public Integer getWidth() {
			return width;
		}
		public void setWidth(Integer width) {
			this.width = width;
		}
		public Integer getHeight() {
			return height;
		}
		public void setHeight(Integer height) {
			this.height = height;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//构造包装箱
		BoxTemplate boxTemplate=new Main().new BoxTemplate();
		boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;
		while (scanner.hasNext()) {
			boxTemplate.length = scanner.nextInt();
			boxTemplate.width = scanner.nextInt();
			boxTemplate.height = scanner.nextInt();

			int itemNum = scanner.nextInt();
			//构造商品
			BoxTemplate[] items = new BoxTemplate[itemNum];
			for (int i = 0; i < itemNum; i++) {
				BoxTemplate item = new Main().new BoxTemplate();
				item.price = scanner.nextInt();
				item.length = scanner.nextInt();
				item.width = scanner.nextInt();
				item.height = scanner.nextInt();
				items[i] = item;
			}
			long startTime = System.currentTimeMillis();
			System.out.println(process());

		}
	}

}