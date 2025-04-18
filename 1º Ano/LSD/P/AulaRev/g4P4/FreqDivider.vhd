library ieee
use ieee.std_logic_1164.all
use ieee.numeric_std.all;

entity FreqDivider is
port(clkIn : in std_logic;
k
: in std_logic_vector(31 downto 0);
clkOut : out std_logic);
end FreqDivider;
architecture Behavioral of FreqDivider is
signal s_counter : unsigned(31 downto 0);
signal s_halfWay : unsigned(31 downto 0);
begin
s_halfWay <= (unsigned(k) / 2);
process(clkIn)
begin
if (rising_edge(clkIn)) then
-- Complete o código
end if;
end process;
end Behavioral;