package Java.DSA.Arays2;

import java.util.*;
public class RainWaterPrac4{
    public static int TrapWater(int height[]){
        int Max = Integer.MIN_VALUE;
        int width = 1;
        int n = height.length;

        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedwater = 0;
        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(LeftMax[i], rightMax[i]);
            trappedwater += (waterlevel - height[i]) * width;
        }
        return trappedwater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {6,5,7,5,8,4,9,0,1,3,5};
        System.out.println(TrapWater(height));
    }
}
