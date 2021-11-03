package com.xworkz.xworkz.DTH;


public class DthPay {
	public OperatorsDTO[] operator;
	private int index;
	
	public  DthPay(int size) {
		operator=new OperatorsDTO[size];
	}
		public void addOperatorDetails(OperatorsDTO operatorsDTO) {
			if (operatorsDTO.getOperatorId()!=0 && operatorsDTO.getOperatorName()!=null &&operatorsDTO.getOffer()!=null&&
					operatorsDTO.getPeriod()!=0 && operatorsDTO.getPrice()!=0) {
				operator[index++] = operatorsDTO;
			}
			
	}
		public void getOperatorsDetails() {
			for ( OperatorsDTO operatorsDTO : operator) {
				System.out.println("Operators Details" +operatorsDTO.getOperatorId()+" "+operatorsDTO.getOperatorName()+" "+
						operatorsDTO.getOffer()+" "+operatorsDTO.getPeriod()+" "+operatorsDTO.getPrice());
		}
		}
//		public void infoBYOperatorName(String operatorName) {
//			
//				for (OperatorsDTO operatorsDTO : operator) {
//					System.out.println("Operators Details" +operatorsDTO.getOperatorId()+" "+operatorsDTO.getOperatorId()+" "+
//							operatorsDTO.getOffer()+" "+operatorsDTO.getPeriod()+" "+operatorsDTO.getPrice());
//			}
//			
//				System.out.println("plz enter the operator name");
//			
//
//			
//		}
		public boolean updateOperatorNameByOperatorId(int operatorId, String operatorName) {
			boolean check=false;
			
				for (OperatorsDTO operatorsDTO : operator) {
					if(operatorsDTO.getOperatorId()==operatorId) {
						operatorsDTO.setOperatorName(operatorName);
						check=true;
					}
					
				}
			
			return check;
		}
		public void deleteOperatorId(int operatorId) {
			for (int i = 0; i < operator.length; i++) {
				if (operator[i].getOperatorId() == operatorId) {
					operator[i] = null;
					System.out.println("operator deleted");
				}
			
		}
}
}
