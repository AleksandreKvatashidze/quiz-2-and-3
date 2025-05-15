# Java Program: quiz2

## Overview

The `quiz2` program demonstrates how to merge two lists (one containing integers and the other containing strings), map the integers to corresponding indices in the string list, and then outputs the resulting list. The mapping is based on predefined hardcoded integer-to-index mappings. After the mapping, the resulting list of strings is printed.

## Program Flow

1. **Initialize List1 (Integers)**: This list contains integer values that will be used to map to specific strings in `list2`.
   Example: `[9, 5, 5, 6, 3, 3, 6, 4, 9, 6, 5, 6, 3]`

2. **Initialize List2 (Strings)**: This list contains string values that are mapped using indices from `list1`.
   Example: `["WAE", "p6K", "7ti", "IsX", "J64Um", "bFE", "uFwOt", "HGG4x", "MvU13", "mn0k", "nz8", "kpz", "MkQg", "5d7", "NhrX", "Bti6", "Imd", "fSbK"]`

3. **Mapping Process**: For each integer in `list1`, the program maps it to the corresponding string in `list2` using hardcoded mappings.

4. **Output**: `list3` is printed.

## Code Explanation

### `quiz2.java`
- **Main Function**: Initializes two predefined lists (`list1` and `list2`), maps the integers in `list1` to the corresponding indices in `list2`, and creates a new list (`list3`). Finally, it prints the result  `list3`.

- **`inputOutput` Method**: This method is responsible for returning a mapped index based on predefined integer values. It uses a hardcoded set of mappings to return specific indices from `list2`.

### Example Output

```plaintext
Result List: [J64Um, 5d7, HGG4x, MvU13, Imd, Bti6, fSbK, kpz, nz8, p6K, WAE, IsX, mn0k]
