def find_pairs_with_common_elements(dictionary):
    result_dict = {}

    for key1, set1 in dictionary.items():
        for key2, set2 in dictionary.items():
            if key1 < key2 and any(item in set2 for item in set1):
                common_interest = next(item for item in set1 if item in set2)
                
                # Check if common_interest is already a key in the dictionary
                if common_interest in result_dict:
                    result_dict[common_interest].append((key1, key2))
                else:
                    result_dict[common_interest] = [(key1, key2)]

    return result_dict


def main():
    A = "reading"
    B = "eating"
    C = "traveling"
    D = "writing"
    E = "running"
    F = "music"
    G = "movies"
    H = "programming"

    interests = {
        "Marco": {A, D, E, F},
        "Anna": {E, A, G},
        "Maria": {G, D, E},
        "Paolo": {B, D, F},
        "Frank": {D, B, E, F, A},
        "Teresa": {F, H, C, D}
        }


    print("a) Table of common interests:")
    commoninterests = find_pairs_with_common_elements(interests)
    print(commoninterests)

    for interest, pairs in commoninterests.items():
        print(f"{interest}: {pairs}")

    print("b) Maximum number of common interests:")
    maxCI = max(commoninterests, key = lambda k: commoninterests[k])
    print(maxCI)

    print("c) Pairs with maximum number of matching interests:")

    new_dict = {}
    array = []
    for key1 in interests.keys(): #lista de keys
        array.append(key1)
        for key2 in interests.keys():
            if key2 in array:
            
                 pass
            else:            #caso contrario manda 
                for i in interests[key1]:
                    for i2 in interests[key2]:
                        if i == i2:
                            new_dict[(key1,key2)] = new_dict.get((key1,key2),0) + 1




    maxmatches = max(new_dict, key=lambda k: new_dict[k])
    print(maxmatches)

    print("d) Pairs with low similarity:")
    lowJaccard = min(new_dict, key=lambda k: new_dict[k])
    print(lowJaccard)


# Start program:
main()

