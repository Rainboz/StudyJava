package com.zhb.LintCode.sushu;

import java.util.Arrays;

public class Sushu {
    /*
     * @param : an array of integer
     * @return: the first missing prime number
     */
    public static int firstMissingPrime(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++){
           // System.out.println(nums[i]);
        }
        if(nums.length == 0 || nums[0] > 2){
            System.out.println(2);
            return 2;
        }
        for(int i = 2; i < nums[0]; i++){
            boolean flag = false;
            for(int k = 2; k <= Math.sqrt(k)+1;k++){
                if(i%k == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(i);
                return i;
            }
        }
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = nums[i] + 1; j < nums[i+1]; j++){
                boolean flag = false;
                for(int k = nums[0]; k <= Math.sqrt(j); k++){
                    if(j % k == 0 ){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    System.out.println(i);
                    return j;
                }
            }
        }
        for(int i = nums[nums.length - 1] + 1;; i++){
            boolean flag = false;
            for(int k = nums[0]; k <= Math.sqrt(i); k++){
                if(i % k == 0 ){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(i);
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int [] a ={2,3,5,7,11,13,17,23,29};
        firstMissingPrime(a);
    }
}
