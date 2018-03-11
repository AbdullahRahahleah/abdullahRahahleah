<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>


<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Mr </title>
</head>
<body>
<div class="container">
<h2 >Hello ${Objects.getUserInfo().getUserId()} </h2>
<br/>
<div class="card-deck">
<form action = "/home" method = "GET">
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Destination City (like Miami )</label>
	  <input type="text" name ="destinationCity" value=""/>	 
	  <br/>
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Region IDs (like 6126616)</label>
	  <input type="text" name ="regionIds" value=""/>
	  <br/>
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Length of Stay (Days)</label>
	  <input type="text" name ="lengthOfStay" value=""/>
	  <br/>
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Min Trip Start Date</label>
	  <input type="date" data-date-inline-picker="true" name="minTripStartDate"/>
	  <br/>
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Max Trip Start Date</label>
	  <input type="date" data-date-inline-picker="true" name ="maxTripStartDate"/>
	  <br/>
	  
	  <label class="mr-sm-2" for="inlineFormCustomSelect">Min Star Rating</label>
      <select class="custom-select mr-sm-2" name ="minStarRating">
        <option disabled selected value >Choose...</option>
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
        <option value="4">Four</option>
        <option value="5">Five</option>
      </select>
         <br />
      <label class="mr-sm-2" for="inlineFormCustomSelect">Max Star Rating</label>
      <select class="custom-select mr-sm-2"  name ="maxStarRating">
        <option disabled selected value >Choose...</option>
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
        <option value="4">Four</option>
        <option value="5">Five</option>
      </select> 

                 
      <br/>
         <input type = "submit" value = "Search" /> 
</form>
<br/>
<h3> Here are some offers : </h3>
<br/> <br/><br/>


<%int i=1; %>
		<c:forEach items="${Objects.getOffers().getHotel()}" var="Hotel">
		  <%if(i%3 ==1){ 
			 out.print("<div class=\"row\"> ");
			 out.print("<div class=\"col-md-4\">");
		  }
		  else {
			  out.print("<div class=\"col-md-4\">");
		  }
		  i++;
		   %>
			  <div class="card">
			   <a href="https://offersvc.expedia.com${Hotel.getHotelUrgencyInfo().getLink()}" target="_blank">
			   <img margin-right="200px;"  margin-left="200px;" class="card-img-top"  width="300px" height="170px"  src="${Hotel.getHotelInfo().getHotelImageUrl()}" alt="Card image cap"/>
			    </a> 
			    <div class="card-block">
			      <h4 class="card-title">${Hotel.getHotelInfo().getHotelName()}</h4>
			      <p class="card-text">
			      <ul>
			      	<li style=" color:red; font-weight: bold;"> SAVE  ${Hotel.getHotelPricingInfo().getPercentSavings()}% </li>
			      	<li style=" color:gold; font-weight: bold;">Star Rating : ${Hotel.getHotelInfo().getHotelStarRating()} </li>
			      	<li> ${Hotel.getDestination().getLongName()} (${Hotel.getDestination().getRegionID()}) </li>
			      	<li>City :${Hotel.getDestination().getCity()} ,Country-Province(${Hotel.getDestination().getCountry()} -${Hotel.getDestination().getProvince()}</li>
			      	<li>Length of Stay : ${Hotel.getOfferDateRange().getLengthOfStay()} Days </li>
			      </ul>
			      <p class="card-text"><small class="text-muted">
					<ul>
						<li>Average price:${Hotel.getHotelPricingInfo().getAveragePriceValue()}  ${Hotel.getHotelPricingInfo().getCurrency()}$</li>
						<li>Offer Date Ranges :From ${Hotel.getOfferDateRange().getTravelStartDate().toString()} TO ${Hotel.getOfferDateRange().getTravelEndDate().toString()}</li>
					</ul>      
			   	   </small>
			      </p>
			      </div>
			      </div>
			      
			        <%if(i%3 ==1){ 
			 out.print("</div>");
			 out.print("</div>");
		  }
		  else {
			  out.print("</div>");
		  }
			%>      
		</c:forEach>
		  </div>

		  </div>
		  	<!-- Bootstrap Core JavaScript -->
		<script src="WEB-INF/assets/bootstrap/js/bootstrap.min.js"></script>
				
</body>
</html>