package main

import "fmt"

func array() {
	var arr [5]int
	fmt.Println(arr)

	arr[4] = 100
	fmt.Println(arr)

	fmt.Println("Length:", len(arr))

	b := [5]int{1, 2, 3, 4, 5}
	fmt.Println(b)

	var twoD [3][4]int
	for i := 0; i < 3; i++ {
		for j := 0; j < 4; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println(twoD)

}
