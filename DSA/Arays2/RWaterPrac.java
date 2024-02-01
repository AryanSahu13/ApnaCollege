package Java.DSA.Arays2;

import java.util.*;
public class RWaterPrac{
    // water level = Math.min(max leftboundary, max right boundary)
    public static int TrappedWater(int height[]){
        int width = 1;
        int n = height.length;
        int Max = Integer.MIN_VALUE;
        int[] leftmax_Boundary = new int[n];
        leftmax_Boundary[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax_Boundary[i] = Math.max(height[i], leftmax_Boundary[i-1]);
        }
        int[] rightmax_Boundary = new int[n];
        rightmax_Boundary[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax_Boundary[i] = Math.max(height[i], rightmax_Boundary[i+1]);
        }
        int TrappedWater = 0;
        for(int i = 0; i < n; i++){
            int WaterLevel = Math.min(leftmax_Boundary[i], rightmax_Boundary[i]);
            TrappedWater += (WaterLevel - height[i]) * width;
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {1,2,4,5,6,7,9};
        System.out.println(TrappedWater(height));
    }
}
