package Java.DSA.Arays2;

// WaterLevel = Math.min(Max Left Boundary, Max Right Boundary)
// TrappedWater = Math.Max(height, waterlevel) * width, where width = 1;

import java.util.*;
public class RainWaterPrac3{
    public static int trappedwater(int height[]){
        int MaxHeight = Integer.MIN_VALUE;              //(Negative Infinity)
        int n = height.length;
        int width = 1;

        // Left Max Boundary
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        //  Right Max Boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedwater = 0;
        for(int i = 0; i < n; i++){
            int WaterLevel = Math.min(LeftMax[i], rightMax[i]);
            trappedwater += (WaterLevel - height[i]) * width;
        }
        return trappedwater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {6,4,3,7,8,1,9,0,8};
        System.out.println(trappedwater(height));
    }
}