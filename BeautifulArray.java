package com;
import java.io.*;
import java.util.*;

import java.lang.*;
public class BeautifulArray {

	static class InputReader {
		public BufferedReader buff;
		public StringTokenizer token;

		public InputReader(InputStream stream) {
			buff = new BufferedReader(new InputStreamReader(stream), 32768);
			token = null;
		}

		public String next() {
			while (token == null || !token.hasMoreTokens()) {
				try {
					token = new StringTokenizer(buff.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			return token.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}


	public static int max(int[] tab){
			int max = tab[0]; 
			for(int i=0 ; i< tab.length ;i++){
				if(tab[i] > max) {max = tab[i] ;}
			}
			return max;
		}

		
	public static int min(int[] tab){
			int min = tab[0]; 
			for(int i=0 ; i< tab.length ;i++){
				if(tab[i] < min) {min = tab[i] ;}
			}
			return min;
		}
		
		
	public static  int firstocc(int[] tab  , int a){
			int j = -1 ; 
			do{
				j++;
				
			}while(tab[j]!=a && j <tab.length);
			
			if(j< tab.length) return j ;
			else return -1;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);

		int T = in.nextInt();
		for (int i = 0 ; i < T ; i++){
			int n = in.nextInt();
			int[] tab = new int[n];

			for(int j=0 ; j< tab.length ; j++){
				tab[j] = in.nextInt();
			}
			
			int max = max(tab);
			
			int min = min(tab);
			
			int occMax = firstocc(tab, max);
			
			int occMin = firstocc(tab, min);
			
			boolean t = true ;


				if(max>1){
				int l = 0 ;
				while(l < tab.length && t){
					if(l!=occMax){t=(tab[l]==1 || tab[l]==0);}
					if(!t){out.println("no");break;}
					l++;
				}
				if (l==tab.length) out.println("yes");
				
				
			}else if(min<-1){
				int l = 0 ;
				while(l < tab.length && t){
					if(l!=occMin){t=(tab[l]==1 || tab[l]==0);}
					if(!t){out.println("no");break;}
					l++;
				}
				if (l==tab.length) out.println("yes");
				
			}else if(min==-1 && max==-1){
				out.println("no");
			}else{
				out.println("yes");
			}
			
		}
		


		out.close();
	}
	}
