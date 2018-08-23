'use strict'

var module = angular.module('daoApp.controllers', []);
module.controller('CompanyController', 
                  ['$scope', "CompanyService", function($scope, CompanyService) {
                      $scope.companyDto = {
                          
                      };
                  }
                  ]
                  );