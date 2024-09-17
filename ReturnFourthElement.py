# strg = "How are you"
# # Remove spaces from the string
# filtered_strg = strg.replace(" ", "")
# print(filtered_strg)
# # Access the 4th and 5th elements (index 3 and 4)
# fourth_element = filtered_strg[3]
# fifth_element = filtered_strg[3+4]
# print(fourth_element, fifth_element)

# ----------------------------------------------------------------
# Without using any inbuild method

strg = "How are you"
k=int(input("Enter Elements to be returned: "))
count = 0
fourth_element = ''
fifth_element = ''

# Iterate over the string to skip spaces and count non-space characters
for char in strg:
    if char != ' ':  # Ignore spaces
        count += 1
        if count == k:
            fourth_element = char
        elif count == k+k:
            fifth_element = char
            break  # Stop once we've found the 4th and 5th elements

print(fourth_element, fifth_element)
