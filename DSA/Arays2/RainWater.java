// (WaterLevel - BarLevel) * Width = Trapped Water
// width is always 1 (acc to que).
// Min no. of bars required to trap water, is greater than 2.
// Ascending, descending ordered bars, also dosen't work.
// Empty space where the rainwater gets trapped, is known as Valley (or) pocket (only when a small bar is between 2 big bars).

// WaterLevel = Math.min(max left boundary, max right boundary)
// To get left & right most, we use auxillary or helper arrays. (left most = [], right most = []).

package Java.DSA.Arays2;

import java.util.*;
public class RainWater{
    public static int TrapWater(int height[]){
        int Max = Integer.MIN_VALUE;

        // Calculate LeftMax Boundary- array
        int[] LeftMax = new int[height.length];
        LeftMax[0] = height[0];                                     //First element is same
        for(int i = 1; i < height.length; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        // Calculate RightMax Boundary- array
        int[] RightMax = new int[height.length];
        RightMax[height.length - 1] = height[height.length - 1];    //last element is same
        for(int i = height.length - 2; i >= 0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        // Loop
        int TrappedWater = 0;
        for(int i = 0; i < height.length; i++){
            int WaterLevel = Math.min(LeftMax[i], RightMax[i]);
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrapWater(height));
    }
}
