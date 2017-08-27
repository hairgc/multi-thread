package com.github.mahui53541.multithread.t299;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
		while (scanner.hasNextLine()) {
			String[] options = scanner.nextLine().split(";");
			if (options.length < 5) {
				break;
			}
			lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
		}
		scanner.close();

		// wirte your code here
		List<String> result = calculateUnilateral(lineList);

		for (String str : result) {
			System.out.println(str);
		}
	}

	public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
		List<String> result = new ArrayList<String>();
		int size=lineList.size();
		for(int i=0;i<size;i++) {
			UnilateralLine ul1=lineList.get(i);
			for(int j=i+1;j<size;j++) {
				UnilateralLine ul2=lineList.get(j);
				if(ul1.getSCen().equals(ul2.getECen())&&ul1.getECen().equals(ul2.getSCen())) {
					if(ul1.getTType().equals(ul2.getTType())) {
						result.add("rule 1:"+ul1.getId()+"+"+ul2.getId());
						break;
					}else {
						if(ul1.getTType().equals("17.5m")) {
							for(int y=j+1;y<size;y++) {
								UnilateralLine ul3=lineList.get(y);
								if(ul3.getECen().equals(ul2.getECen())&&ul3.getSCen().equals(ul2.getSCen())&&ul3.getTType().equals("9.6m")) {
									result.add("rule 1:"+ul1.getId()+"+"+ul2.getId()+"+"+ul3.getId());
									break;
								}
							}
						}else {
							for(int y=j+1;y<size;y++) {
								UnilateralLine ul3=lineList.get(y);
								if(ul3.getECen().equals(ul1.getECen())&&ul3.getSCen().equals(ul1.getSCen())&&ul3.getTType().equals("9.6m")) {
									result.add("rule 1:"+ul1.getId()+"+"+ul2.getId()+"+"+ul3.getId());
									break;
								}
							}
						}
					}
				}else if(ul1.getSCen().equals(ul2.getECen())||ul1.getECen().equals(ul2.getSCen())){
					if(ul1.getSCen().equals(ul2.getECen())) {
						if(ul1.getTType().equals(ul2.getTType())) {
							boolean flag=false;
							for(int y=j+1;y<size;y++) {
								UnilateralLine ul3=lineList.get(y);
								if(ul3.getSCen().equals(ul1.getECen())&&ul3.getECen().equals(ul2.getSCen())&&ul3.getTType().equals(ul1.getTType())) {
									result.add("rule 2:"+ul1.getId()+"+"+ul2.getId()+"+"+ul3.getId());
									flag=true;
									break;
								}
							}
							
							if(!flag) {
								if(ul1.getEPro().equals(ul2.getSPro())) {
									result.add("rule 3:"+ul1.getId()+"+"+ul2.getId());
								}
							}
						}else {
							boolean flag=false;
							for(int y=j+1;y<size;y++) {
								UnilateralLine ul3=lineList.get(y);
								if(ul3.getSCen().equals(ul2.getECen())&&ul3.getECen().equals(ul1.getSCen())&&ul3.getTType().equals(ul1.getTType())) {
									result.add("rule 2:"+ul1.getId()+"+"+ul2.getId()+"+"+ul3.getId());
									flag=true;
									break;
								}
							}
							if(!flag) {
								if(ul1.getSPro().equals(ul2.getEPro())) {
									result.add("rule 3:"+ul1.getId()+"+"+ul2.getId());
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static class UnilateralLine {
		private String id;
		private String sCen;// 出发分拨
		private String sPro;// 出发省
		private String eCen;// 到达分拨
		private String ePro;// 到达省
		// 9.6m/17.5m
		private String tType;// 车型

		public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
			this.id = id;
			this.sCen = sCen;
			this.sPro = sPro;
			this.eCen = eCen;
			this.ePro = ePro;
			this.tType = tType;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSCen() {
			return sCen;
		}

		public void setSCen(String ePro) {
			this.ePro = ePro;
		}

		public String getSPro() {
			return sPro;
		}

		public void setSPro(String sPro) {
			this.sPro = sPro;
		}

		public String getECen() {
			return eCen;
		}

		public void setECen(String eCen) {
			this.eCen = eCen;
		}

		public String getEPro() {
			return ePro;
		}

		public void setEPro(String ePro) {
			this.ePro = ePro;
		}

		public String getTType() {
			return tType;
		}

		public void setTType(String tType) {
			this.tType = tType;
		}
	}
}
