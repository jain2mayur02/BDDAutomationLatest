Feature: Test Back Office Modules

  Background: User is Logged In
    Given user is on Home Page
    When user enter id and password

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Market basis
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Fixed Amount Discount Type
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with fixed discount type "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on basis of supported payment methods
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with supported payment option "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Product Specific import by excel
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of product specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing 
  Scenario Outline: Create PromoCode on Product Specific Manually add
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of product specific Manually add "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Customer Specific
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of customer specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on seller ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with seller ID filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Category filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Category sub level filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category sub level filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Category sub to sub level filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category sub to sub level filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Minimun Rank ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with mininium rank filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Brand Name filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with brandname filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on HotKeywords filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with hotkeywords filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Brand Zone filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code brandzone filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on Exclude seller ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with exclude seller ID filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  |
      | ORDER DISCOUNT |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on seller type filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with seller type filter specific "<PromoCodeType>" "<sellertype>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  | sellertype   |
      | ORDER DISCOUNT | All          |
      | ORDER DISCOUNT | Local        |
      | ORDER DISCOUNT | Cross-Border |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on price range filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with price range filter "<PromoCodeType>" "<condition>" "<operator>" "<price>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  | condition | operator | price |
      | ORDER DISCOUNT | AND       | =        |    10 |
      | ORDER DISCOUNT | AND       | <        |    10 |
      | ORDER DISCOUNT | AND       | >        |    10 |
      | ORDER DISCOUNT | AND       | <=       |    10 |
      | ORDER DISCOUNT | AND       | >=       |    10 |
      | ORDER DISCOUNT | OR        | =        |    10 |
      | ORDER DISCOUNT | OR        | <        |    10 |
      | ORDER DISCOUNT | OR        | >        |    10 |
      | ORDER DISCOUNT | OR        | <=       |    10 |
      | ORDER DISCOUNT | OR        | >=       |    10 |

  @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode on section filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with section specific "<PromoCodeType>" "<section>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  | section   |
      | ORDER DISCOUNT | Offer     |
      | ORDER DISCOUNT | OfferList |
      | ORDER DISCOUNT | DOD       |
      
     
      
      
     @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode with filter Combination [Section + SellerType]
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with filter combination of "<PromoCodeType>" "<section>" "<sellertype>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType  | section   |sellertype   |
      | ORDER DISCOUNT | Offer     |All          |
      
      
       @RegressionPromoCode @Marketing
  Scenario Outline: Create PromoCode with filter Combination [Category,Brandname,PriceRange]
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
     And create the promo code with filter combination of category brandname pricerange "<PromoCodeType>" "<condition>" "<operator>" "<price>"
      Then verify promocode should be create successfully
      Then delete created test promocode
	
     Examples: 
      | PromoCodeType  | condition | operator | price |
      | ORDER DISCOUNT | AND       | =        |    10 |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create RegressionPromoCodeWalletDiscount on Market basis
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create RegressionPromoCodeWalletDiscount on Fixed Amount Discount Type
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with fixed discount type "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create RegressionPromoCodeWalletDiscount on basis of supported payment methods
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with supported payment option "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Product Specific import by excel
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of product specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

 	@RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Product Specific Manually add
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of product specific Manually add "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Customer Specific
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code of customer specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on seller ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with seller ID filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Category filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

 @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Category sub level filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category sub level filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Category sub to sub level filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with category sub to sub level filter "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Minimun Rank ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with mininium rank filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Brand Name filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with brandname filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on HotKeywords filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with hotkeywords filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

 @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Brand Zone filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code brandzone filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on Exclude seller ID filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with exclude seller ID filter specific "<PromoCodeType>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   |
      | WALLET CASHBACK |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on seller type filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with seller type filter specific "<PromoCodeType>" "<sellertype>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   | sellertype   |
      | WALLET CASHBACK | All          |
      | WALLET CASHBACK | Local        |
      | WALLET CASHBACK | Cross-Border |

  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on price range filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with price range filter "<PromoCodeType>" "<condition>" "<operator>" "<price>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   | condition | operator | price |
      | WALLET CASHBACK | AND       | =        |    10 |
       | WALLET CASHBACK | AND       | <        |    10 |
      | WALLET CASHBACK | AND       | >        |    10 |
      | WALLET CASHBACK | AND       | <=       |    10 |
      | WALLET CASHBACK | AND       | >=       |    10 |
      | WALLET CASHBACK | OR        | =        |    10 |
      | WALLET CASHBACK | OR        | <        |    10 |
      | WALLET CASHBACK | OR        | >        |    10 |
      | WALLET CASHBACK | OR        | <=       |    10 |
      | WALLET CASHBACK | OR        | >=       |    10 |
     
  @RegressionPromoCodeWalletDiscount @Marketing
  Scenario Outline: Create PromoCodeWalletDiscount on section filter
    Given user click on promo Code
    When user click on promo management
    Then promo management page open successfully
    And create the promo code with section specific "<PromoCodeType>" "<section>"
    Then verify promocode should be create successfully
    Then delete created test promocode

    Examples: 
      | PromoCodeType   | section   |
      | WALLET CASHBACK | Offer     |
     

  @RegressionDOD @Marketing 
  Scenario: Create DOD on Market basis
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And create the deal of the dod
    Then verify deal should be create successfully
    And sync deal created
    And delete the deal

  @RegressionDOD @Marketing
  Scenario: Check validation for existing DOD and Incorrect date range
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And create the deal of the dod
    Then verify validation message for existing deal


  @RegressionDOD @Marketing
  Scenario: Check download sample file for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And check download sample file in productid tab

  @RegressionDOD @Marketing
  Scenario: Check Upload product by excel File for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And upload product by excel
    Then verify deal should be create successfully
    And delete the deal

  @RegressionDOD @Marketing
  Scenario: Check Upload product by Add Product option for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And add product using productid option
    Then verify deal should be create successfully
    And delete the deal

  @RegressionDOD @Marketing
  Scenario: Check Product Export and Delete all option on DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And check export option on dod
    #Then verify exportfile download successfully
    And click on delete all

  @RegressionDOD @Marketing
  Scenario: Check Edit option on DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And upload product by excel
    Then verify deal should be create successfully
    And edit the deal
    Then verify deal should be updated successfully
    And delete the edit deal

  @RegressionOfferDeal @Marketing
  Scenario: Create OfferDeal on Market basis
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And create the offer deal
    Then verify offerdeal should be create successfully
    And delete the offerdeal

  @RegressionOfferDeal @Marketing
  Scenario: Check Download Excel for offer deal
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And check download sample file offer productid tab

  @RegressionOfferDeal @Marketing
  Scenario: Check Upload product by excel File for offer deal
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And upload offer product by excel
    Then verify offerdeal should be create successfully
    And delete the offerdeal

  @RegressionOfferDeal @Marketing
  Scenario: CheckUpload product by Add Product option for offer deal
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And add product using productid option for offerdeal
    Then verify offerdeal should be create successfully
    And delete the offerdeal

  @RegressionOfferDeal @Marketing
  Scenario: Check Product Export and Delete all option on offer deal
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And check export option on offerdeal
    #Then verify exportfile download successfully
    And click on delete all on offerdeal

  @RegressionOfferDeal @Marketing
  Scenario: Check Edit option  on offer deal
    Given user click on product management
    When user click on offer deal
    Then offer deal of the page open successfully
    And upload offer product by excel
    Then verify offerdeal should be create successfully
    And edit the offerdeal
    Then verify offerdeal should be updated successfully
    And delete the edit offerdeal

  @RegressionCategoryConfig
  Scenario: Create Root Category on Category config
    Given user click on product management
    When user click on category config
    Then category config page open successfully
    And create the root category
    Then verify root category create successfully

  @RegressionCategoryConfig
  Scenario: Assign sub category to already create root Category
    Given user click on product management
    When user click on category config
    Then category config page open successfully
    And assign sub category to root category
    Then verify sub category assign successfully

  @RegressionCategoryConfig
  Scenario: Assign sub to sub category to already create Category
    Given user click on product management
    When user click on category config
    Then category config page open successfully
    And assign sub to sub category
    Then verify sub to sub category assign successfully

  @RegressionProductManagement
  Scenario: Assign category to products
    Given user click on product management
    When user click on product management tab
    Then product management page open successfully
    And assign root category to test products
    Then verify root category assign to product successfully

  @RegressionProductManagement
  Scenario: Assign sub level category to products
    Given user click on product management
    When user click on product management tab
    Then product management page open successfully
    And assign sub level category to test products
    Then verify sub level category assign to product successfully

  @RegressionProductManagement
  Scenario: Assign sub to sub level category to products
    Given user click on product management
    When user click on product management tab
    Then product management page open successfully
    And assign sub to sub level category to test products
    Then verify sub to sub level category assign to product successfully

  @RegressionSBO @RegressionSBOLive
  Scenario: Import and update Product on SBO using Import Excel
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And import product using import excel
    Then verify product imported successfully
    Then verify product values reflected successfully
    Then verify multivarient product imported successfully
    Then verify multivarient product values reflected successfully
    And update product using import excel
    Then verify updateproduct imported successfully
    Then verify updateproduct values reflected successfully

  @RegressionSBO @RegressionSBOLive
  Scenario: Import Product on SBO using Add and Edit Product Manually
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And add product using Add Products
    Then verify manual add product values reflected successfully
    And Edit the product and update the values
    Then verify manual edit product values reflected successfully

  @RegressionSBO @RegressionSBOLive
  Scenario: Verify Batch Settings Options
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    Then verify disable product using batch setting
    Then verify enable product using batch setting
    Then verify archived product using batch setting
    Then verify set marketplace using batch setting

  @RegressionSBO @RegressionSBOLive
  Scenario: Verify Negative Scenarios on SBO using Import Excel
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And import product using negative import excel
    Then verify validation message for all negative scenarios

  @RegressionSBO @RegressionSBOLive
  Scenario: Verify Negative Scenarios on SBO using update Import Excel
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And import update product using negative import excel
    Then verify validation message for all update negative scenarios

  @RegressionSBO @RegressionSBOLive
  Scenario: Verify Negative Scenarios on SBO using add product
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And user click on add product and click on save without giving any values
    Then verify all validation message on add product

  @RegressionSBO @RegressionSBOLive
  Scenario: Verify set category on SBO
    Given user click on user management
    When user click on seller management
    Then seller management page open successfully
    And user navigate to seller back office
    And user set category for products
    Then verify category set to all products successfully
