def subsetTarget(arr, indx, sum_1, sum_2, target_1, target_2, hasTarget):
	if(indx >= len(arr)):
		return hasTarget and sum_1 == target_2 and sum_2 == target_1

	    subsetTarget(arr, indx + 1, sum_1 + arr[indx], sum_2, target_1, arr[indx], hasTarget)
        subsetTarget(arr, indx + 1, sum_1 + arr[indx], sum_2, target_1, target_2, True)
        subsetTarget(arr, indx + 1, sum_1 , sum_2 + arr[indx], arr[indx] , target_2, hasTarget) 
        subsetTarget(arr, indx + 1, sum_1 , sum_2 + arr[indx], target_1, target_2, True)

#   The element can belong to the sum of subset 1 and be a target for subset 2.
# 	The element can belong to the sum of subset 1 and not be a target for subset 2.
# 	The element can belong to the sum of subset 2 and be a target for subset 1.
# 	The element can belong to the sum of subset 2 and not be a target for subset 1.


array = [1 ,6, -2, -5, 3, 2] #YES
print("YES" if subsetTarget(array, 0, 0, 0, 0, 0, False) else "NO")

array_2 = [1,2,3,6] #NO
print("YES" if subsetTarget(array_2, 0, 0, 0, 0, 0, False) else "NO")

array_3 = [5,-5,5,-5] #NO (This one is not working :( ))
print("YES" if subsetTarget(array_3, 0, 0, 0, 0, 0, False) else "NO")

array_4 = [5,6,2,-4,-7,4] #YES
print("YES" if subsetTarget(array_4,0, 0, 0, 0, 0, False) else "NO")

array_5 = [-1,2,5,3,-2] #YES
print("YES" if subsetTarget(array_5,0, 0, 0, 0, 0, False) else "NO")

array_6 = [1,0,-1,0] #YES
print("YES" if subsetTarget(array_6,0, 0, 0, 0, 0, False) else "NO")

array_7 = [1,0,-1,0,1] # YES
print("YES" if subsetTarget(array_7,0, 0, 0, 0, 0, False) else "NO")
