# Project: SJSU Foodie App
#### Team #2: Elena Ilic, Manasi Nekkar, Robert Veloya

## Problem to resolve: 
Difficulty identifying items on local restaurant menus that are compatible with certain dietary restrictions (vegetarian, vegan, etc). 

### Previous Works:
!Any relevant previous work? otherwise, delete

### Operating Environment:
PC application.

## Description:
The SJSU Foodie App is designed to accomodate to students that adhere to specific dietary restrictions. It is designed to be a collection of menu items that fit according to a Spartan's lifestyle. Spartans can leave reviews, recommend food items, and provide tips and tricks when visiting a specific restaurant in campus -- or even the Spartan Food Pantry!

## Functionality: 
By implementing an application that takes input from users (similar to a recommendation system) we can create a "database" of local menu items and what dietary restrictions they might adhere to. This can then be viewed to see what menu items are compatible with the user's personal potential restrictions. User input also allows for accuracy in restaurant menu items and dietary offerings. The application offers a view of local restaurants and the like, where the user can look at specific menu items and the ratings and reviews left behind by previous users. <br />

Potential idea: classes to identify restaurant, user, review, item. User and Restaurant interact in the main program. Restaurant takes an array of Items to represent its menu, The items themselves could also have their own arrays to signify reviews and also have attributes to signal what dietary needs they fit with. <br />

Potential restrictions: vegetarian, vegan, halal, kosher, gluten free, lactose intolerance, food allergy, etc

Reviews can also detect if a user review is commenting about these certain topics about the restaurant : <br />
 - Food <br />
 - Environment <br />
 - Service <br />
Users can also have leave recommendations on the food/drinks that they found that they enjoyed as well as any tips when visiting the store.



## Operations:
### App user: interacting with system <br />
- write review: write a review to be uploaded to the foodie "database" <br />
- view restaurants: view all restaurants in an area <br />
- select restaurant: select the desired restaurant <br />
- select item: select the desired items <br />

### Foodie: serving user requests <br />
- upload review: upload the user's review to be uploaded <br />
- quantify review: identify review (positive, negative, etc) <br />
- show restaurants: show the user the list of participating restaurants <br />
- show menu: display a restaurants menu to the user <br />
- show review: display an item's results to the user <br />
- tips and recommendations: Provide rating towards a certain item or leave notes for a future customer <br />
##### References:
common dietary restrictions: https://www.medicinenet.com/the_12_most_common_dietary_restrictions/article.htm
