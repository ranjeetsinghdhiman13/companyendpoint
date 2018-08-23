'use strict'

angular.module('daoApp.services', []).factory('CompanyService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAllCompanies = function() {
				return $http.get(CONSTANTS.getAllCompanies);
			}
			return service;
		} ]);