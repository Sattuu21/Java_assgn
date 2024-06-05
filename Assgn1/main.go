package main

import "fmt"

func slice() {
	var a = []int{1, 2, 3, 4}

	a = append(a, 23)
	a[2] = 90

	fmt.Println(a)

	var s []string
	s = make([]string, 3)
	fmt.Println("length:", len(s))

	s = append(s, "Satyam")
	fmt.Println(s)

	twoD := make([][]int, 3)
	for i := 0; i < 3; i++ {
		innerLen := i + 1
		twoD[i] = make([]int, innerLen)
		for j := 0; j < innerLen; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d: ", twoD)
}

func maps() {
	kit := make(map[string]int)

	kit["Dhoni"] = 07
	kit["Kohli"] = 18
	kit["Satyam"] = 11

	fmt.Println(kit)

	getKit := kit["Satyam"]
	fmt.Println(getKit)

	for key, value := range kit {
		fmt.Printf("Jersey number of %v is %v \n", key, value)
	}
}

func rangE() {
	nums := []int{2, 3, 4}
	sum := 0
	for _, num := range nums {
		sum += num
	}
	fmt.Println("sum:", sum)
}
func main() {
	rangE()
}
