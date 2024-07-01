# Try-Catch-Method
Project goal - to find exception in different cathegories when phrase "table" is entered in the Search field. 
1. startTest – navigates to the appropriate website with driver.get and accepts all cookie preferences.
2. testActions – navigates to the Search field, clears it and enters the phrase “table” in the Search field.
3. int[ ] ids – all categories in which the word "table" is searched. Examples of categories: “Furniture”, “Transport”, “Real Estate”, “Computing”, “Clothes, Footwear” and etc. 
Every category is visited using for loop. 
With Try-Catch Method exceptional category from all list of the same categories is found and additional action to accept decision is made. 
