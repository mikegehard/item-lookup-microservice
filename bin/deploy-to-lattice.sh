#!/usr/bin/env bash
set -e

# Make sure that you are targeting the correct Lattice instance
# `ltc target <lattice installation> before running.

ltc remove item-lookup
ltc create item-lookup msgehard/item-lookup:$1