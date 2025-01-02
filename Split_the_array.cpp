#include <iostream>
#include <vector>

int main() {
    std::vector<int> originalArray = {1, 2, 3, 4, 5, 6, 7, 8};
    
    int mid = originalArray.size() / 2;
    
    // If array length is odd, the first half will have one extra element
    std::vector<int> firstHalf(originalArray.begin(), originalArray.begin() + mid + (originalArray.size() % 2));
    std::vector<int> secondHalf(originalArray.begin() + firstHalf.size(), originalArray.end());
    
    // Print the two halves
    std::cout << "First Half: ";
    for (int num : firstHalf) {
        std::cout << num << " ";
    }
    std::cout << std::endl;
    
    std::cout << "Second Half: ";
    for (int num : secondHalf) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
