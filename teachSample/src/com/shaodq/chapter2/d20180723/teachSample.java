package com.shaodq.chapter2.d20180723;

import java.util.Arrays;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*float i=10.0F;
        double j=10.0;*/
        
        /*System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        */
        /*int[] scores;//1. �����������
        scores=new int[5];//2. ����ռ䣨���䳤�ȣ�
        //3. ������Ԫ�ظ�ֵ
        scores[0]=100;
        scores[1]=99;
        scores[2]=100;
        scores[3]=99;
        scores[4]=100;
        
        //4. ʹ������ֵ---������Ԫ�ش�ӡ����
        for(int k=0;k<scores.length;k++){
        	System.out.println(scores[k]);
        }*/
        
        //�϶�Ϊһ
        //int[] scores=new int[5];
        
        //����Ϊһ
        int[] _scores=new int[]{100,98,97,85,93};
        int[] scores={100,98,97,85,93};
        
        
        for(int i=0;i<_scores.length;i++){
        	System.out.print(_scores[i]+" ");
        }
        
        System.out.println();
        
        Arrays.sort(_scores);
        
        for(int i=0;i<_scores.length;i++){
        	System.out.print(_scores[i]+" ");
        }
	}

}
