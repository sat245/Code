package Competitions.Syncron;

import java.util.Arrays;

public class HowManyNumbInFirstArrIsSmalThnSecArr {
    public static int [] counts(int [] nums,int [] maxes){
        int l1 = maxes.length;
        int l2 = nums.length;

        int [] res = new int[l1];

        if(l1<=0 || l2<=0){
            return res;
        }

        Arrays.sort(nums);
        //Arrays.sort(maxes);
        for(int i=0;i<l1;i++){
            int number = maxes[i];
            int count = 0;
            int j = 0;
            if(i>0 && maxes[i-1]>=number){
                j=count;
            }
            for(;j<l2;j++){
                if(nums[j]<=number){
                    count++;
                }else {
                    break;
                }
            }
            res[i]=count;
        }
        return res;
    }

    public static void main(String [] args)
    {
        int [] num = {1,2,3};
        int maxes[] = {2,4};

        int res [] = counts(num,maxes);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }


    }}
